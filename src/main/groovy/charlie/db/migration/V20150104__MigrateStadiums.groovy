package charlie.db.migration

import charlie.db.domain.entity.Stadium
import charlie.db.domain.repository.StadiumRepository
import charlie.db.helpers.BeanAccessor
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration
import org.springframework.jdbc.core.JdbcTemplate

import static java.lang.Integer.parseInt

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
class V20150104__MigrateStadiums implements SpringJdbcMigration {

    @Override
    void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        StadiumRepository stadiumRepository = BeanAccessor.bean(StadiumRepository)
        File stadiumsFile = new File('src/main/resources/charlie/db/csv/stadiums.csv')

        stadiumsFile.eachLine {
            List<String> columns = it.replace(';', ' ;').tokenize(';')
            Stadium stadium = new Stadium(
                    name: columns[0],
                    capacity: parseInt(columns[1].replace(',', ''))
            )
            stadiumRepository.save(stadium)
        }
        println 'finished with stadiums'

    }
}
