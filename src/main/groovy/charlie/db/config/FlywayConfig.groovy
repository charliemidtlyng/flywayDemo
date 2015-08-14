package charlie.db.config

import org.flywaydb.core.Flyway
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import javax.sql.DataSource

@Configuration
class FlywayConfig {

    @ConfigurationProperties(prefix = 'flyway')
    @Bean Flyway flyway(DataSource dataSource) {
        new Flyway(dataSource: dataSource)
    }

}
