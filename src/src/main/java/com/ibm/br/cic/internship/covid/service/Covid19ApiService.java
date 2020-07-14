package com.ibm.br.cic.internship.covid.service;

import com.ibm.br.cic.internship.covid.model.CompareBy;
import com.ibm.br.cic.internship.covid.model.Comparison;
import com.ibm.br.cic.internship.covid.model.Country;
import com.ibm.br.cic.internship.covid.model.Summary;
import java.util.List;

/**
 * @author JamieRichardson
 */
public interface Covid19ApiService {

  Summary getSummary();

  Comparison getComparison(List<Country> countries, CompareBy compareBy);
}
