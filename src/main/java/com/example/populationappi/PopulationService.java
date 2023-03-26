package com.example.populationappi;

import org.springframework.stereotype.*;

import java.util.HashMap;

@Service
public class PopulationService {


    //HashMap<String,Integer> countryWisePopulation = new HashMap<String,Integer>() ;

    HashMap<String,Integer> countryWisePopulation = new HashMap<String,Integer>() ;


    public PopulationService() {
        countryWisePopulation.put("China",100);
        countryWisePopulation.put("Pakistan",20);
        countryWisePopulation.put("India",150);
        countryWisePopulation.put("Singapore",5);
        countryWisePopulation.put("United States of America",33);
    }




    public int getPopulation (String Country ){

        int value= 0 ;
        if (countryWisePopulation.containsKey(Country)) {
            // Mapping
            value = countryWisePopulation.get(Country);

        } else{

            value = -1;
        }

        return value;
    }








}
