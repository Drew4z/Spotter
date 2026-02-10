package com.spotter_proyect.spotter.core.shared.entities;

import com.spotter_proyect.spotter.core.shared.enums.Specialty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trainers")
@PrimaryKeyJoinColumn(name = "user_id") // Usa el mismo ID que User
@Data
@EqualsAndHashCode(callSuper = true) // Necesario al heredar con Lombok
public class TrainerEntity extends UserEntity {

    @Column(columnDefinition = "TEXT")
    private String biography;

    @Enumerated(EnumType.STRING)
    @Column(name="specialty")
    private Specialty specialty; // Yoga, Crossfit...

    @Column(name="phoneNumber")
    private String phoneNumber; // El dato "oculto" hasta el match

    @Column(name="isVerified")
    private boolean isVerified = false;

    // Relación 1:N: 1 entrenador tiene N vídeos; 1 vídeo solo pertenece a 1 entrenador
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<VideoEntity> videos;
}
