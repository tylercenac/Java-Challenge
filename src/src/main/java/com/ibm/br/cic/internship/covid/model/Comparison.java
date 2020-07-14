package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * @author JamieRichardson
 */
@Data
public class Comparison {
	
  @JsonProperty("Countries")
  private List<Country> countries;

  private CompareBy compareBy;

  public Comparison() {
    super();
  }

  public Comparison(final List<Country> countries, final CompareBy compareBy) {
    super();
    this.countries = countries;
    this.compareBy = compareBy;
  }

  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(final List<Country> countries) {
    this.countries = countries;
  }

  public CompareBy getCompareBy() {
    return compareBy;
  }

  public void setCompareBy(final CompareBy compareBy) {
    this.compareBy = compareBy;
  }

}
