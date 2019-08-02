package org.ven;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogging {

    private static final Logger logger = LoggerFactory.getLogger(TestLogging.class);

    public void bar() {

        String name = "lordofthejars";
        logger.info("Hello from Bar.");
        logger.debug("In bar my name is {}.", name);
    }


}
