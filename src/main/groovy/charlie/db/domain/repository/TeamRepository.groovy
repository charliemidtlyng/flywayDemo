package charlie.db.domain.repository

import charlie.db.domain.entity.Team
import org.springframework.data.repository.CrudRepository

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
interface TeamRepository  extends CrudRepository<Team, Long> {

}