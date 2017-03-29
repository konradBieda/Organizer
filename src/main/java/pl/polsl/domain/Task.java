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
 * Created by Jakub Majcher on 29.03.17.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long idIternation; // TODO JM
    private String title;
    private String description;

    private long idResolver; // TODO JM

    private long idCreator; // TODO JM

    //private LocalDateTime dateOfCreate; // TO JM - change to better type

    private String category; // TODO JM

    private String status; // TODO JM


}
