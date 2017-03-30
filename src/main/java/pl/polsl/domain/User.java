package pl.polsl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Jakub Majcher on 30.03.17.
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;
    private String password;
    private String role;
}
