package charlie.db.config

import org.springframework.boot.orm.jpa.EntityScan
import org.springframework.context.annotation.*
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@EntityScan('charlie.db.domain')
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = ['charlie.db.domain.repository'],
        repositoryImplementationPostfix = 'Jpa'
)
@Configuration
@ComponentScan(value = 'charlie.db.domain')
class DomainConfig {

}
