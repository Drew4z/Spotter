package com.spotter_proyect.spotter.core.useCases.auth.register.application.port.persistence;

import com.spotter_proyect.spotter.core.shared.model.User;

public interface RegisterRepositoryPort {

    User save(User userDomain);
}
