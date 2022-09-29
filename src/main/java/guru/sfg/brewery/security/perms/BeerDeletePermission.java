package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/****************************
 * Author: Michael File
 * Name: BeerDeletePermissions
 * Date: Sep 28, 2022
 * Description:
 ***************************/
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('beer.delete')")
public @interface BeerDeletePermission {
}
