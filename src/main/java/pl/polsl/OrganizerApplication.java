package pl.polsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import pl.polsl.domain.Task;

@SpringBootApplication
public class OrganizerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizerApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        Task task = new Task(221, 1, "tytuł", "opis222", 1,
                1, "kategoria", "status");

        restTemplate.put("http://localhost:8887/api/organizer/task/save", task);

        restTemplate.getForObject("http://localhost:8887/api/organizer/task", String.class);
    }

}
