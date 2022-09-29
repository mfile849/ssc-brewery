package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/****************************
 * Author: Michael File
 * Name: RoleRepository
 * Date: Sep 28, 2022
 * Description:
 ***************************/
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String customer);
}
