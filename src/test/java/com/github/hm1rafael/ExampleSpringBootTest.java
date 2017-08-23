package com.github.hm1rafael;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class ExampleSpringBootTest {

    @Autowired Example example;

    @Test
    public void thisWorks() {
        example.doSomething();
    }

    @Configuration
    public static class ExampleTestJavaConfiguration {

        @MockBean Example example;

    }

}

