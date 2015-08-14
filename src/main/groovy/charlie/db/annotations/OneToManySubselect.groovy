package charlie.db.annotations

import groovy.transform.AnnotationCollector
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode

import javax.persistence.FetchType
import javax.persistence.OneToMany

import static javax.persistence.CascadeType.PERSIST
import static javax.persistence.CascadeType.REMOVE

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@OneToMany(
        fetch = FetchType.LAZY,
        cascade = [PERSIST, REMOVE],
        mappedBy = 'team'
)
@Fetch(FetchMode.SUBSELECT)
@AnnotationCollector
@interface OneToManySubselect {
}
