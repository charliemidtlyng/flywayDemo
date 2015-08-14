package charlie.db

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = [FlywayAutoConfiguration])
class Application implements CommandLineRunner {

    @Autowired private Flyway flyway

    static void main(String[] args) {
        SpringApplication.run Application, args
    }

    @Override
    void run(String... args) {
        flyway.migrate()
    }

}
