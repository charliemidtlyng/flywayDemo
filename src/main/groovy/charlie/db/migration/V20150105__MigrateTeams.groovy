package charlie.db.migration

import charlie.db.domain.entity.Team
import charlie.db.domain.repository.StadiumRepository
import charlie.db.domain.repository.TeamRepository
import charlie.db.helpers.BeanAccessor
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration
import org.springframework.jdbc.core.JdbcTemplate

import static java.lang.Long.parseLong

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
class V20150105__MigrateTeams implements SpringJdbcMigration {
    @Override
    void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        StadiumRepository stadiumRepository = BeanAccessor.bean(StadiumRepository)
        TeamRepository teamRepository = BeanAccessor.bean(TeamRepository)
        File teamsFile = new File('src/main/resources/charlie/db/csv/teams.csv')

        teamsFile.eachLine {
            List<String> columns = it.replace(';', ' ;').tokenize(';')
            Team team = new Team(
                    name: columns[1],
                    stadium: stadiumRepository.findOne(parseLong(columns[0].replace(' ', '')))
            )
            teamRepository.save(team)
        }
        println 'finished with teams'

    }
}
