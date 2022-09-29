package guru.sfg.brewery.domain.security;

import guru.sfg.brewery.domain.security.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.UUID;

/****************************
 * Author: Michael File
 * Name: BeerOrderauthenticationManager
 * Date: Sep 29, 2022
 * Description:
 ***************************/
@Slf4j
@Component
public class BeerOrderAuthenticationManger {

    public boolean customerIdMatches(Authentication authentication, UUID customerId){
        User authenticatedUser = (User) authentication.getPrincipal();

        log.debug("Auth User Customer Id: " + authenticatedUser.getCustomer().getId() + " Customer Id:" + customerId);

        return authenticatedUser.getCustomer().getId().equals(customerId);
    }

}
