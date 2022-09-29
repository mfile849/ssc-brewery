package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/****************************
 * Author: Michael File
 * Name: BreweryReadPermissions
 * Date: Sep 28, 2022
 * Description:
 ***************************/
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('brewery.read')")
public @interface BreweryReadPermission {
}
