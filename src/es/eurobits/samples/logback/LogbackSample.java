package es.eurobits.samples.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogbackSample {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("es.eurobits.samples.logback");

        for (int i = 0; i < 10; i++) {
            logger.debug(" - " + System.currentTimeMillis());
        }

        String siftLabel = "foo";

        MDC.put("siftLabel", siftLabel);

        for (int i = 0; i < 10; i++) {
            logger.debug(siftLabel + " - " + System.currentTimeMillis());
        }

        siftLabel = "bar";

        MDC.put("siftLabel", siftLabel);

        for (int i = 0; i < 10; i++) {
            logger.debug(siftLabel + " - " + System.currentTimeMillis());
        }

    }

}
