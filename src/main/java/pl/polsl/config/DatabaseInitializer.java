package pl.polsl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.domain.Project;
import pl.polsl.repository.ProjectRepository;

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
            projectRepository.save(project);
        }
    }

}
