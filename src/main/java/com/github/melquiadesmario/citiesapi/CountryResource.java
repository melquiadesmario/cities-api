package com.github.melquiadesmario.citiesapi;

import com.github.melquiadesmario.citiesapi.countries.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @GetMapping
    public ist<Country> countries(){

    }
}
