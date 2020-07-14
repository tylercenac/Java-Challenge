package com.ibm.br.cic.internship.covid.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.ibm.br.cic.internship.covid.model.CompareBy;
import com.ibm.br.cic.internship.covid.model.Comparison;
import com.ibm.br.cic.internship.covid.model.Country;
import com.ibm.br.cic.internship.covid.model.Global;
import com.ibm.br.cic.internship.covid.model.Summary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author JamieRichardson
 */
@Service
public class Covid19ApiServiceImpl implements Covid19ApiService {
	
  @Value("${covid19api.uri}")
  private final String uri;
	
  public Covid19ApiServiceImpl() {
		super();
		this.uri = "";
  }
	

  public Covid19ApiServiceImpl(final String uri) {
		super();
		this.uri = uri;
	}

  public String getUri() {
	return uri;
  }


@Override
 public Summary getSummary() {
    final RestTemplate restTemplate = new RestTemplate();
    final String response = restTemplate.getForObject(uri, String.class);
    final JsonObject jsonObject = new Gson().fromJson(response, JsonObject.class);

    final String globalFromRes = new Gson().toJson(jsonObject.get("Global").getAsJsonObject());
    final String countriesFromRes = new Gson().toJson(jsonObject.get("Countries").getAsJsonArray());

    final Global global = new Gson().fromJson(globalFromRes, Global.class);

    final List<Country> countries = new Gson().fromJson(countriesFromRes, new TypeToken<ArrayList<Country>>() {
        }.getType());

    return new Summary(global, countries);
  }

  @Override
 public final Comparison getComparison(final List<Country> countries, final CompareBy compareBy) {

    // Sort list of countries by the given property in descending order 
    switch (compareBy) {
    
      case TotalConfirmed:
        Collections.sort(countries, (c1, c2) -> Integer.compare(c2.getTotalConfirmed(), c1.getTotalConfirmed()));
        break;

      case TotalDeaths:
        Collections.sort(countries, (c1, c2) -> Integer.compare(c2.getTotalDeaths(), c1.getTotalDeaths()));
        break;

      case TotalRecovered:
        Collections.sort(countries, (c1, c2) -> Integer.compare(c2.getTotalRecovered(), c1.getTotalRecovered()));
        break;
        
      default: 
        Collections.sort(countries, (c1, c2) -> Integer.compare(c2.getTotalConfirmed(), c1.getTotalConfirmed()));
        break;
    }

    return new Comparison(countries, compareBy);

  }
 
}
