package charlie.db.domain.entity

import charlie.db.annotations.OneToManySubselect
import charlie.db.annotations.OneToOneJoin

import javax.persistence.Entity

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@Entity
class Team extends BaseEntity {

    String name

    @OneToManySubselect Set<Player> players

    @OneToOneJoin Stadium stadium

}
