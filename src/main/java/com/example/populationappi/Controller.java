package com.example.populationappi;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class Controller {

private final PopulationService populationService;

public Controller( PopulationService populationService){
    this.populationService = populationService;
}

@GetMapping("/findpopulation")
public ResponseEntity findPopulation(@RequestParam String country){

int value = 0;

value = populationService.getPopulation(country);

return ResponseEntity.ok(value);


}












}
