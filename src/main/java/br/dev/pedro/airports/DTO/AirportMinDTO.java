/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.pedro.airports.DTO;

import br.dev.pedro.airports.entities.Airport;

/**
 *
 * @author DIT2B
 */
public class AirportMinDTO {

    public AirportMinDTO() {
    }
    
    private long id;
    private String name;
    private String city;
    private String iataCode;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }
    
    public AirportMinDTO(Airport airport) {
        this.id = airport.getId();
        this.name = airport.getName();
        this.city = airport.getCity();
        this.iataCode = airport.getIataCode();
    }
    
    
}
    

