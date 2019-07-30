package com.app.rc.getting_started_with_logging_frameworks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Logback Using SLF4J implementation
 * To see the logging to file try running mvn soring-boot:run plugin
 * NOTE: Slf4j from Lombok provides log to use directly for logging
 */
@SpringBootApplication
@Slf4j
public class GettingStartedWithLoggingFrameworksApplication implements CommandLineRunner {

    private static final String DIV = "---------------------------------------------------------------------------";

    public static void main(String[] args) {
        SpringApplication.run(GettingStartedWithLoggingFrameworksApplication.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     */
    @Override
    public void run(String... args) {
        log.info(DIV);
        log.info("This is INFO level log");
        log.debug("This is DEBUG level log");
        log.warn("This is WARN level log");
        log.error("This is ERROR level log");
        log.trace("This is ERROR level log");
    }
}
