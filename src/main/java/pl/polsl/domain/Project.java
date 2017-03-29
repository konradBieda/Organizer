package pl.polsl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.polsl.defs.ProjectStatusType;

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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

    private String name;

    private String description;

    private LocalDateTime beginDateTime;

    private LocalDateTime endDateTime;

    //    private List<Sprint> sprints;
    //TODO PS powiązać relacją ze sprintami

//    private List<String> storySizeUnits;
    //TODO PS storySizeUnits zamienić na obiekt

    private ProjectStatusType status;

}