package com.spotter_proyect.spotter.core.shared.repositories;

import com.spotter_proyect.spotter.core.shared.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // ¡Magia! Spring implementa esto solo con leer el nombre del método
    Optional<UserEntity> findByEmail(String email);

    boolean existsByEmail(String email);
}
