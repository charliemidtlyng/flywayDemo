package charlie.db.helpers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

/**
 * @author Charlie Midtlyng (charlie.midtlyng@BEKK.no)
 */
@Component
class BeanAccessor implements ApplicationContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(BeanAccessor)

    private static ApplicationContext context

    static <T> T bean(Class<T> clazz) {
        try {
            context.getBean(clazz)
        } catch (Exception t) {
            LOG.error "Getting bean of type ${clazz} failed: $t.message(), returning null"
            null
        }
    }

    @Override
    void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext
    }
}
