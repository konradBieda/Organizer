package pl.polsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.polsl.domain.Project;
import pl.polsl.domain.Sprint;
import pl.polsl.service.ProjectService;
import pl.polsl.service.SprintService;

import java.util.List;

/**
 * Created by psikorski on 25.03.2017.
 */
@RestController
@RequestMapping(path = "/api/organizer")
public class SprintController {

    @Autowired
    private SprintService sprintService;

    @GetMapping(path = "/sprint", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Sprint> getAllProjects() {
        return sprintService.getSprints();
    }

    @GetMapping(path = "/sprint/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Sprint getProject(@PathVariable long id) {
        return sprintService.getSprint(id);
    }

    @PutMapping(path = "/sprint", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void saveSprint(@RequestBody Sprint sprint) {
        sprintService.saveSprint(sprint);
    }

}
