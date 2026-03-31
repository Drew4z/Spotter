package com.spotter_proyect.spotter.core.shared.utils;


import com.spotter_proyect.spotter.core.exceptions.errors.ResourceNotFoundException;
import com.spotter_proyect.spotter.core.exceptions.errors.UnauthenticatedException;
import com.spotter_proyect.spotter.core.shared.entities.ClientEntity;
import com.spotter_proyect.spotter.core.shared.repositories.ClientRepository;
import com.spotter_proyect.spotter.core.shared.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;

@RequiredArgsConstructor
public class Utils {

    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

    public Long getId(Authentication auth){

        if(auth != null){
            String email = auth.getName();
            ClientEntity client = clientRepository.findByEmail(email)
                    .orElseThrow(()-> new ResourceNotFoundException("The user could not be found"));

            return client.getId();
        }
        throw new UnauthenticatedException("The token is not valid");

    }
}
