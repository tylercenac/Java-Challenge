package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
@Data
public class Summary {

  @JsonProperty("Global")
    public Global global;

  @JsonProperty("Countries")
    public List<Country> countries;
  
  public Summary() {
	  super();
  }

  public Summary(final Global global, final List<Country> countries) {
    this.global = global;
    this.countries = countries;
  }


}
