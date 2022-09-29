package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/****************************
 * Author: Michael File
 * Name: BeerCreatePermissions
 * Date: Sep 28, 2022
 * Description:
 ***************************/
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('beer.create')")
public @interface BeerCreatePermission {
}
