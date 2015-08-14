package charlie.db.migration

import charlie.db.domain.entity.Player
import charlie.db.domain.repository.PlayerRepository
import charlie.db.domain.repository.TeamRepository
import charlie.db.helpers.BeanAccessor
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration
import org.springframework.jdbc.core.JdbcTemplate

import static java.lang.Integer.parseInt
import static java.lang.Long.parseLong

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
class V20150106__MigratePlayers implements SpringJdbcMigration {

    @Override
    void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        TeamRepository teamRepository = BeanAccessor.bean(TeamRepository)
        PlayerRepository playerRepository = BeanAccessor.bean(PlayerRepository)
        File playersFile = new File('src/main/resources/charlie/db/csv/players.csv')

        playersFile.eachLine {
            List<String> columns = it.replace(';', ' ;').tokenize(';')
            Player player = new Player(
                    name: columns[2],
                    team: teamRepository.findOne(parseLong(columns[0].replace(' ', ''))),
                    number: parseInt(columns[1].replace(' ', ''))
            )
            playerRepository.save(player)
        }
        println 'finished with players'

    }
}
