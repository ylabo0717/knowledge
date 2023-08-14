package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenMailPostsEntity;


/**
 * メールから投稿
 */
@DI(instance = Instance.Prototype)
public class MailPostsEntity extends GenMailPostsEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static MailPostsEntity get() {
        return Container.getComp(MailPostsEntity.class);
    }

    /**
     * Constructor.
     */
    public MailPostsEntity() {
        super();
    }

    /**
     * Constructor
     * @param messageId Message-ID
     */

    public MailPostsEntity(String messageId) {
        super( messageId);
    }

}
