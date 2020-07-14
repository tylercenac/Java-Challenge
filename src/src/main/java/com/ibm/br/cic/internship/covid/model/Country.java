package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author JamieRichardson
 */
@Data
public class Country {
	
  @JsonProperty("Country")
  @SerializedName("Country")
    private String country;

  @JsonProperty("CountryCode")
  @SerializedName("CountryCode")
    private String countryCode;

  @JsonProperty("Slug")
  @SerializedName("Slug")
    private String slug;

  @JsonProperty("NewConfirmed")
  @SerializedName("NewConfirmed")
    private int newConfirmed;

  @JsonProperty("TotalConfirmed")
  @SerializedName("TotalConfirmed")
    private int totalConfirmed;

  @JsonProperty("NewDeaths")
  @SerializedName("NewDeaths")
    private int newDeaths;

  @JsonProperty("TotalDeaths")
  @SerializedName("TotalDeaths")
    private int totalDeaths;

  @JsonProperty("NewRecovered")
  @SerializedName("NewRecovered")
    private int newRecovered;

  @JsonProperty("TotalRecovered")
  @SerializedName("TotalRecovered")
    private int totalRecovered;

  @JsonProperty("Date")
  @SerializedName("Date")
    private String date;	

  public Country() {
    super();
  }

  
    
  public String getCountry() {
    return country;
  }

  public void setCountry(final String country) {
    this.country = country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(final String countryCode) {
    this.countryCode = countryCode;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(final String slug) {
    this.slug = slug;
  }

  public int getNewConfirmed() {
    return newConfirmed;
  }

  public void setNewConfirmed(final int newConfirmed) {
    this.newConfirmed = newConfirmed;
  }

  public int getTotalConfirmed() {
    return totalConfirmed;
  }

  public void setTotalConfirmed(final int totalConfirmed) {
    this.totalConfirmed = totalConfirmed;
  }

  public int getNewDeaths() {
    return newDeaths;
  }

  public void setNewDeaths(final int newDeaths) {
    this.newDeaths = newDeaths;
  }

  public int getTotalDeaths() {
    return totalDeaths;
  }

  public void setTotalDeaths(final int totalDeaths) {
    this.totalDeaths = totalDeaths;
  }

  public int getNewRecovered() {
    return newRecovered;
  }

  public void setNewRecovered(final int newRecovered) {
    this.newRecovered = newRecovered;
  }

  public int getTotalRecovered() {
    return totalRecovered;
  }

  public void setTotalRecovered(final int totalRecovered) {
    this.totalRecovered = totalRecovered;
  }

  public String getDate() {
    return date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

}
