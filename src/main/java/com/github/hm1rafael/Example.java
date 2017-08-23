package com.github.hm1rafael;

import org.springframework.beans.factory.annotation.Autowired;

public class Example {

    @Autowired
    private ExampleDependency exampleDependency;

    public void doSomething() {
        System.out.println("Did something");
    }

}
