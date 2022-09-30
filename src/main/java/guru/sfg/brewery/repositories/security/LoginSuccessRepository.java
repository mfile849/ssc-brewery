package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.LoginSuccess;
import org.springframework.data.jpa.repository.JpaRepository;

/****************************
 * Author: Michael File
 * Name: LoginSuccessRepository
 * Date: Sep 29, 2022
 * Description:
 ***************************/
public interface LoginSuccessRepository extends JpaRepository<LoginSuccess, Integer> {
}
