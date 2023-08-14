package org.support.project.di;

import org.support.project.aop.Aspect;

@DI(impl = TestInterfaceImpl.class, instance = Instance.Singleton)
public interface TestInterface {

    @Aspect(advice = TestAdvice.class)
    void test();

}
