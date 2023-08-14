package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenTokensEntity;


/**
 * 認証トークン
 */
@DI(instance = Instance.Prototype)
public class TokensEntity extends GenTokensEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static TokensEntity get() {
        return Container.getComp(TokensEntity.class);
    }

    /**
     * Constructor.
     */
    public TokensEntity() {
        super();
    }

    /**
     * Constructor
     * @param token TOKEN
     */

    public TokensEntity(String token) {
        super( token);
    }

}
