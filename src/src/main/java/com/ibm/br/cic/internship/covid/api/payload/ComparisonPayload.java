package com.ibm.br.cic.internship.covid.api.payload;

import java.util.List;

/**
 * @author JamieRichardson
 */
public final class ComparisonPayload {

  private List<String> countryCodes;
  private String compareBy;
  
  public ComparisonPayload() {
	super();
  }
  
    
  public ComparisonPayload(final List<String> countryCodes, final String compareBy) {
	super();
	this.countryCodes = countryCodes;
	this.compareBy = compareBy;
  }

public List<String> getCountryCodes() {
    return countryCodes;
  }
  
  public void setCountryCodes(final List<String> countryCodes) {
    this.countryCodes = countryCodes;
  }
  
  public String getCompareBy() {
    return compareBy;
  }
  
  public void setCompareBy(final String compareBy) {
    this.compareBy = compareBy;
  }
 
}
