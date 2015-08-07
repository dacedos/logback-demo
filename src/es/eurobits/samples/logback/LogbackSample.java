package es.eurobits.samples.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackSample {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("es.eurobits.samples.logback");

        for (int i = 0; i < 100000; i++) {
            logger.debug("Hello world:" + i);
        }

    }

}
