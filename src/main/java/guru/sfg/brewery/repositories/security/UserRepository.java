package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/****************************
 * Author: Michael File
 * Name: UserRepository
 * Date: Sep 22, 2022
 * Description:
 ***************************/
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
