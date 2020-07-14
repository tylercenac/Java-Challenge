package com.ibm.br.cic.internship.covid.api;

import com.ibm.br.cic.internship.covid.model.Summary;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.ibm.br.cic.internship.covid.model.CompareBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.br.cic.internship.covid.service.Covid19ApiService;

/**
 * @author JamieRichardson
 */
@RestController
@RequestMapping("api/v1")
public final class CompareByController {

  private final Covid19ApiService covid19ApiService;

  @Autowired
  public CompareByController(final Covid19ApiService covid19ApiService) {
    this.covid19ApiService = covid19ApiService;
  }

  @ApiOperation(value = "Get CompareBy Values", response = ResponseEntity.class)
  @CrossOrigin(origins = "*")
  @GetMapping(path = "/compareby", produces = "application/json")
  public ResponseEntity<?> getAll() {
    
    List<CompareBy> compareByOptions = Arrays.asList(CompareBy.values());
    
    return new ResponseEntity<>(compareByOptions, HttpStatus.OK);
    
  }
  
}























