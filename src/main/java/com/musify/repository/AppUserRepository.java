package com.musify.repository;

import com.musify.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Add your annotations here
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
