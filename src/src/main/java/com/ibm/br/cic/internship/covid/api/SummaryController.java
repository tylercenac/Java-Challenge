package com.ibm.br.cic.internship.covid.api;

import com.ibm.br.cic.internship.covid.model.Summary;
import io.swagger.annotations.ApiOperation;
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
public final class SummaryController {

  private final Covid19ApiService covid19ApiService;

  @Autowired
  public SummaryController(final Covid19ApiService covid19ApiService) {
    this.covid19ApiService = covid19ApiService;
  }

  @ApiOperation(value = "Get summary", response = ResponseEntity.class)
  @CrossOrigin(origins = "*")
  @GetMapping(path = "/summary", produces = "application/json")
  public ResponseEntity<?> getAll() {
    final Summary summary = this.covid19ApiService.getSummary();
    return new ResponseEntity<>(summary, HttpStatus.OK);
  }
  
}
