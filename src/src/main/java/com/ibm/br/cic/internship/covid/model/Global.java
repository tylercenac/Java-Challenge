package com.ibm.br.cic.internship.covid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author JamieRichardson
 */

@Data
public class Global {

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
  
  public Global() {
    super();
  }


}
