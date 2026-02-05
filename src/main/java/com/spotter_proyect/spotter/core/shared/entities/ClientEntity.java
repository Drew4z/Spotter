package com.spotter_proyect.spotter.core.shared.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientEntity extends UserEntity {

    private String goals; // "Perder peso", "Ganar músculo"

    // Aquí podrías mapear las solicitudes hechas, pero es opcional ponerlo bidireccional
}