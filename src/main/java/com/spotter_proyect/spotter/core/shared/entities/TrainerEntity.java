package com.spotter_proyect.spotter.core.shared.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Entity
@Table(name = "trainers")
@PrimaryKeyJoinColumn(name = "user_id") // Usa el mismo ID que User
@Data
@EqualsAndHashCode(callSuper = true) // Necesario al heredar con Lombok
public class TrainerEntity extends UserEntity {

    @Column(columnDefinition = "TEXT")
    private String biography;

    private String specialty; // Yoga, Crossfit...

    private String phoneNumber; // El dato "oculto" hasta el match

    private Boolean isVerified = false;

    // Relación: Un entrenador tiene muchos videos
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VideoEntity> videos;
}
