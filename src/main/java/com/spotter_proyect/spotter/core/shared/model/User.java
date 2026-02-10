package com.spotter_proyect.spotter.core.shared.model;


import java.time.LocalDateTime;

public interface User {
    // Definimos los métodos que SI O SI deben tener los hijos.
    // Al ser records, estos métodos coinciden con los nombres de los campos.
    Long id();
    String email();
    String password();
    String name();
    String role();
    Boolean isPremium();
    LocalDateTime createdAt();
}
