package pl.polsl.config;

import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by psikorski on 25.03.2017.
 */

@Configuration
@EnableJpaRepositories("pl.polsl.repository")
public class ApplicationConfig {

    @Bean
    public Hibernate4Module hibernate4Module() {
        return new Hibernate4Module();
    }
}
