package com.github.hm1rafael

import org.springframework.context.annotation.Bean
import spock.mock.DetachedMockFactory

class ExampleSpockTestConfiguration {

    def detachedMockFactory = new DetachedMockFactory()

    @Bean
    Example example() {
        return detachedMockFactory.Mock(Example)
    }


}
