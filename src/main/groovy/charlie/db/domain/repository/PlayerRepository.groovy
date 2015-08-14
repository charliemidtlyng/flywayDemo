package charlie.db.domain.repository

import charlie.db.domain.entity.Player
import org.springframework.data.repository.CrudRepository

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
interface PlayerRepository extends CrudRepository<Player, Long> {

}