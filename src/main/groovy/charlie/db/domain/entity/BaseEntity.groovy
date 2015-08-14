package charlie.db.domain.entity

import charlie.db.annotations.GeneratedId

import javax.persistence.MappedSuperclass
import javax.persistence.Version

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@MappedSuperclass
class BaseEntity {
    @GeneratedId Long id
    @Version Integer version = 0

}
