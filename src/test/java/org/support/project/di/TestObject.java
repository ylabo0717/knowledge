package org.support.project.di;

import org.support.project.aop.Aspect;

@DI(instance = Instance.Singleton)
public class TestObject {

    @Aspect(advice = TestAdvice2.class)
    public void test() {
        System.out.println("test");
    }

}
