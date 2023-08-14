package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenServiceLocaleConfigsEntity;


/**
 * サービスの表示言語毎の設定
 */
@DI(instance = Instance.Prototype)
public class ServiceLocaleConfigsEntity extends GenServiceLocaleConfigsEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static ServiceLocaleConfigsEntity get() {
        return Container.getComp(ServiceLocaleConfigsEntity.class);
    }

    /**
     * Constructor.
     */
    public ServiceLocaleConfigsEntity() {
        super();
    }

    /**
     * Constructor
     * @param localeKey ロケールキー
     * @param serviceName サービス名
     */

    public ServiceLocaleConfigsEntity(String localeKey, String serviceName) {
        super( localeKey,  serviceName);
    }

}
