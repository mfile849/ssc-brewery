package guru.sfg.brewery.domain.security;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/****************************
 * Author: Michael File
 * Name: Authority
 * Date: Sep 22, 2022
 * Description:
 ***************************/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String role;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;
}
