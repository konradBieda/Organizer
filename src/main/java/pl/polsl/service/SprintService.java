package pl.polsl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.polsl.domain.Project;
import pl.polsl.domain.Sprint;
import pl.polsl.repository.ProjectRepository;
import pl.polsl.repository.SprintRepository;

import java.util.List;

/**
 * Created by psikorski on 25.03.2017.
 */
@Service
public class SprintService {

    @Autowired
    private SprintRepository sprintRepository;

    public List<Sprint> getSprints() {
        return sprintRepository.findAll();
    }

    public Sprint getSprint(long id) {
        return sprintRepository.findOne(id);
    }

    public void saveSprint(Sprint sprint) {
        sprintRepository.save(sprint);
    }

}
