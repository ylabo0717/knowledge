package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenMailHooksEntity;


/**
 * 受信したメールからの処理
 */
@DI(instance = Instance.Prototype)
public class MailHooksEntity extends GenMailHooksEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static MailHooksEntity get() {
        return Container.getComp(MailHooksEntity.class);
    }

    /**
     * Constructor.
     */
    public MailHooksEntity() {
        super();
    }

    /**
     * Constructor
     * @param hookId HOOK_ID
     */

    public MailHooksEntity(Integer hookId) {
        super( hookId);
    }

}
