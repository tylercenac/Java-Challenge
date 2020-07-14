/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ibm.br.cic.internship.covid.api;

import com.ibm.br.cic.internship.covid.api.payload.DisplayPayload;
import com.ibm.br.cic.internship.covid.model.CompareBy;
import com.ibm.br.cic.internship.covid.model.Comparison;
import com.ibm.br.cic.internship.covid.model.Country;
import com.ibm.br.cic.internship.covid.model.Summary;
import com.ibm.br.cic.internship.covid.service.Covid19ApiService;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TylerCenac
 */
@RestController
@RequestMapping("api/v1")
public final class DisplayController {

  private final Covid19ApiService covid19ApiService;

  @Autowired
  public DisplayController(final Covid19ApiService covid19ApiService) {
    this.covid19ApiService = covid19ApiService;
  }

    
  @ApiOperation(value = "Display comparison", response = ResponseEntity.class)
  @CrossOrigin(origins = "*")
  @PostMapping(path = "/display", consumes = "application/json", produces = "application/json")
  public ResponseEntity<?> getComparison(@RequestBody final DisplayPayload payload) {

    final CompareBy compareBy = CompareBy.valueOf(payload.getCompareBy());
    final Summary summary = this.covid19ApiService.getSummary();
        
        
    // Converts country codes in payload from array to List<String>
    final List<String> countryCodes = new ArrayList<>();
    Collections.addAll(countryCodes, payload.getCountryCodes());
        
        
    // Creates list of country objects from list of country codes selected by user 
    final List<Country> countriesList = summary.countries.stream()
        .filter(country -> countryCodes.contains(country.getCountryCode()))
        .collect(Collectors.toList());
       
    // Validates selection of countries
    if (countriesList.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
        
    final Comparison comparison = this.covid19ApiService.getComparison(countriesList, compareBy);
    return new ResponseEntity<>(comparison, HttpStatus.OK);
       
       
        
  }
    

}