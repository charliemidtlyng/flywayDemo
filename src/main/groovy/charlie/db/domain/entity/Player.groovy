package charlie.db.domain.entity

import charlie.db.annotations.ManyToOneLazyNoCascade

import javax.persistence.Entity

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@Entity
class Player extends BaseEntity {

    String name
    int number

    @ManyToOneLazyNoCascade Team team

}
