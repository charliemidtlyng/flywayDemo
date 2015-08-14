package charlie.db.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = [DomainConfig])
@Configuration
class MigrationConfig {
}
