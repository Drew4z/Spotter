package com.spotter_proyect.spotter.core.shared.repositories;

import com.spotter_proyect.spotter.core.shared.entities.FollowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FollowRepository extends JpaRepository<FollowEntity, Long> {

    // 1. Para contar cuántos seguidores tiene un entrenador (devuelve un número)
    Long countByTrainerId(Long trainerId);

    // 2. Para comprobar si un cliente YA sigue a un entrenador (devuelve true o false)
    boolean existsByClientIdAndTrainerId(Long clientId, Long trainerId);

    // 3. Para buscar el registro exacto (útil para cuando el cliente quiera "Dejar de seguir" y necesites borrarlo)
    Optional<FollowEntity> findByClientIdAndTrainerId(Long clientId, Long trainerId);
}
