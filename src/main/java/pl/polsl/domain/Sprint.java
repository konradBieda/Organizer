package pl.polsl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.polsl.defs.ProjectStatusType;
import pl.polsl.defs.SprintStatusType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by psikorski on 25.03.2017.
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sprintId;

    private String name;

    private String description;

    private LocalDateTime beginDateTime;

    private LocalDateTime endDateTime;

//    private Project project;
    //TODO PS powiązać relacją z projektem
//    private List<Task> tasks;
//    //TODO PS task zamienić na obiekt

//    private List<Column> columns;
//    //TODO PS columns zamienić na obiekt
//
//    private List<Category> categories;
//    //TODO PS categories zamienić na obiekt

    private SprintStatusType status;

}