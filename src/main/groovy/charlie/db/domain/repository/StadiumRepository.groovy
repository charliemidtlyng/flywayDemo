package charlie.db.domain.repository

import charlie.db.domain.entity.Stadium
import org.springframework.data.repository.CrudRepository

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
interface StadiumRepository extends CrudRepository<Stadium, Long> {

}