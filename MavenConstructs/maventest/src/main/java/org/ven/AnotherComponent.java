package org.ven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnotherComponent {

    private static final Logger logger = LoggerFactory.getLogger(AnotherComponent.class);

    public void foo() {
        String name = "Alex";
        logger.info("Hello from Foo.");
        logger.debug("In foo my name is {}.", name);
    }
}
