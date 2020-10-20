package com.dev.usersapp.repositories;

import com.dev.usersapp.entities.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {

    @Query("SELECT p FROM Profile p WHERE p.user.id =?1 AND p.id = ?2")
    Optional<Profile> getByUserIdAndProfileId(Integer userId, Integer profileId);
}
