package com.dev.usersapp.repositories;

import com.dev.usersapp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public Optional<User> findByUsername(String username);
    public Optional<User> findByUsernameAndPassword(String username, String password);


    /**
     * Esto nos es SQL, SE llama JPQL(Java persistent query languaje)
     * @return
     */
    @Query("select u.username FROM User u WHERE u.username like '%s'")
    public Page<String> findUsernames(Pageable pageable);


}
