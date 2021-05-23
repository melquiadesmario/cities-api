package com.github.melquiadesmario.citiesapi.repository;

import com.github.melquiadesmario.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
