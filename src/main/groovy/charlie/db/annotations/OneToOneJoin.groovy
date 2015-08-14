package charlie.db.annotations

import groovy.transform.AnnotationCollector
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode

import javax.persistence.*

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@OneToOne(
        fetch = FetchType.LAZY,
        cascade = [],
        optional = true
)
@Fetch(FetchMode.JOIN)
@JoinColumn
@AnnotationCollector
@interface OneToOneJoin {
}
