package com.ibm.br.cic.internship.covid.api.payload;


/**
 * @author JamieRichardson
 */
public final class DisplayPayload {

  private String[] countryCodes;
  private String compareBy;
  
  
  public DisplayPayload() {
		super();
	}
  
  public DisplayPayload(final String[] countryCodesInput, final String compareBy) {
	super();
	
	final String[] countryCodesArray = new String[countryCodesInput.length];
	System.arraycopy(countryCodesInput, 0, countryCodesArray, 0, countryCodesInput.length);
	
	this.countryCodes = countryCodesArray;
	this.compareBy = compareBy;
  }

  public String[] getCountryCodes() {
		
	final String[] countryCodesArray = new String[countryCodes.length];
	System.arraycopy(countryCodes, 0, countryCodesArray, 0, countryCodes.length);
	
    return countryCodesArray;
  }

  public void setCountryCodes(final String... countryCodesInput) {
	  
	final String[] countryCodesArray = new String[countryCodesInput.length];
	System.arraycopy(countryCodesInput, 0, countryCodesArray, 0, countryCodesInput.length);
		
	this.countryCodes = countryCodesArray;
  }

  public String getCompareBy() {
    return compareBy;
  }
  
  public void setCompareBy(final String compareBy) {
    this.compareBy = compareBy;
  }
    
    
}
