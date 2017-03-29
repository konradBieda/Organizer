package pl.polsl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.domain.Project;
import pl.polsl.repository.ProjectRepository;

import java.util.List;

/**
 * Created by psikorski on 25.03.2017.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public Project getProject(long id) {
        return projectRepository.findOne(id);
    }

    public void saveProject(Project project) {
        projectRepository.save(project);
    }




}
