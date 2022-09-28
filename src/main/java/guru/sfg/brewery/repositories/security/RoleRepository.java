package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/****************************
 * Author: Michael File
 * Name: RoleRepository
 * Date: Sep 28, 2022
 * Description:
 ***************************/
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
