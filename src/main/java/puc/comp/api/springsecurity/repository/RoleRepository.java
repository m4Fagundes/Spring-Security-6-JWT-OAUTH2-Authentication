package puc.comp.api.springsecurity.repository;

    
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import puc.comp.api.springsecurity.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName(String name);

}