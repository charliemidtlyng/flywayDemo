package charlie.db.domain.entity

import javax.persistence.Entity

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@Entity
class Stadium extends BaseEntity {

    String name
    long capacity
}
