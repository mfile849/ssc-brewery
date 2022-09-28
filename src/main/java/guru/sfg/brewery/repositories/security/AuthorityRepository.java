package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/****************************
 * Author: Michael File
 * Name: AuthorityRepository
 * Date: Sep 22, 2022
 * Description:
 ***************************/
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
