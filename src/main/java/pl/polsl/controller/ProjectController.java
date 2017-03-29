package pl.polsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.polsl.domain.Project;
import pl.polsl.service.ProjectService;

import java.util.List;

/**
 * Created by psikorski on 25.03.2017.
 */
@RestController
@RequestMapping(path = "/api/organizer")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(path = "/project", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Project> getAllProjects() {
        return projectService.getProjects();
    }

    @GetMapping(path = "/project/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Project getProject(@PathVariable long id) {
        return projectService.getProject(id);
    }

}
