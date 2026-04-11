package com.musify.repository;

import com.musify.entity.AppUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Add your annotations here
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Boolean existsByEmail(String email);

    Optional <AppUser> findByEmail(String email);

    Optional <AppUser> findByRefreshToken(String refreshToken);
}
