package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

/****************************
 * Author: Michael File
 * Name: UserRepository
 * Date: Sep 22, 2022
 * Description:
 ***************************/
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    List<User> findAllByAccountNonLockedAndLastModifiedDateIsBefore(Boolean locked, Timestamp timestamp);
}
