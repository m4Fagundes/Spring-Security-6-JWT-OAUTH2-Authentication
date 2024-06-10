package puc.comp.api.springsecurity.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import puc.comp.api.springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

    Optional<User> findByUsername(String username);

}