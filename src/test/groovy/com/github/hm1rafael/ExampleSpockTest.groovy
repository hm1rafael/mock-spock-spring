package com.github.hm1rafael

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = ExampleSpockTestConfiguration)
class ExampleSpockTest extends Specification {

    @Autowired
    private Example example

    def "this fails"() {
        when: "That example mock was correctly injected"
        println "example"
        then: "then do something"
        example.doSomething()
    }

}
