package pl.polsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.polsl.domain.Task;
import pl.polsl.service.TaskService;

import java.util.List;

/**
 * Created by Jakub Majcher on 29.03.17.
 */

@RestController
@RequestMapping(path = "/api/organizer")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(path = "/task", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Task> getAllTasks() {
        return taskService.getTasks();
    }

    @GetMapping(path = "/task/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Task getTask(@PathVariable long id) {
        return taskService.getTask(id);
    }

    @PutMapping(path = "/task/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveTask(@RequestBody Task task) {
        taskService.saveTask(task);
    }
}