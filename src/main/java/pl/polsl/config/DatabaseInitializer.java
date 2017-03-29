package pl.polsl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.defs.ProjectStatusType;
import pl.polsl.defs.SprintStatusType;
import pl.polsl.domain.Project;
import pl.polsl.domain.Sprint;
import pl.polsl.domain.Task;
import pl.polsl.repository.ProjectRepository;
import pl.polsl.repository.SprintRepository;
import pl.polsl.repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by psikorski on 25.03.2017.
 */
@Service
public class DatabaseInitializer {

    @Autowired
    public void saveRandomProjects(ProjectRepository projectRepository) {
        for (int i = 0; i < 10; i++) {
            Project project = new Project();
            project.setName("Name: " + UUID.randomUUID().toString());
            project.setDescription("Description: " + UUID.randomUUID().toString());
            project.setBeginDateTime(LocalDateTime.now());
            project.setEndDateTime(LocalDateTime.now().plusDays(5));
            project.setStatus(ProjectStatusType.OPEN);

            projectRepository.save(project);
        }
    }

    @Autowired
    public void saveRandomSprints(SprintRepository sprintRepository) {
        for (int i = 0; i < 3; i++) {
            Sprint sprint = new Sprint();
            sprint.setName("Name: " + UUID.randomUUID().toString());
            sprint.setDescription("Description: " + UUID.randomUUID().toString());
            sprint.setBeginDateTime(LocalDateTime.now());
            sprint.setEndDateTime(LocalDateTime.now().plusDays(5));
            sprint.setStatus(SprintStatusType.FUTURE);

            sprintRepository.save(sprint);
        }
    }

    @Autowired
    public void saveRandomTasks(TaskRepository taskRepository) {
        for (int i = 0; i < 10; i++) {
            Task task = new Task(i, 1, "tytuł", "opis", 1,
                    1, "kategoria", "status");

            taskRepository.save(task);
        }

    }
}
