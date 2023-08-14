package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenPinsEntity;

/**
 * ピン
 */
@DI(instance = Instance.Prototype)
public class PinsEntity extends GenPinsEntity {
    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * インスタンス取得
     * AOPに対応
     * @return インスタンス
     */
    public static PinsEntity get() {
        return Container.getComp(PinsEntity.class);
    }

    /**
     * コンストラクタ
     */
    public PinsEntity() {
        super();
    }

    /**
     * コンストラクタ
     * @param no NO
     */
    public PinsEntity(Integer no) {
        super( no);
    }
}