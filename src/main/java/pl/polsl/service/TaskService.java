package pl.polsl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.domain.Task;
import pl.polsl.repository.TaskRepository;

import java.util.List;

/**
 * Created by Jakub Majcher on 29.03.17.
 */

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(long id) {
        return taskRepository.getOne(id);
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

}
