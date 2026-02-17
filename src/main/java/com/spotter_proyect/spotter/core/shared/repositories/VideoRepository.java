package com.spotter_proyect.spotter.core.shared.repositories;

import com.spotter_proyect.spotter.core.shared.entities.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, Long> {

    // Método para obtener todos los videos de un trainer por su ID
    List<VideoEntity> findAllByTrainerIdOrderByCreatedAtDesc(Long trainerId);

    // Método para obtener el feed de forma aleatoria
    @Query(value = "SELECT * FROM videos ORDER BY RANDOM()", nativeQuery = true)
    List<VideoEntity> findAllRandom();
}
