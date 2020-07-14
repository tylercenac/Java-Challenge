package com.ibm.br.cic.internship.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author JamieRichardson
 */
@SpringBootApplication
@ComponentScan("com.ibm.br.cic.internship.covid")
public class Covid19Application {

  public static void main(String[] args) {
    SpringApplication.run(Covid19Application.class, args);
  }
  
}
