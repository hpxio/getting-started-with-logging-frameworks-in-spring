package com.app.rc.getting_started_with_logging_frameworks.config.logback.converter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class NameTagConverter extends ClassicConverter {
    /**
     * The convert method is responsible for extracting data from the event and
     * storing it for later use by the write method.
     *
     * @param event Event called for Logging
     */
    @Override
    public String convert(ILoggingEvent event) {
        return "iHSPA::GettingStartedWithLoggingFramework:Logback-Using-SLF4J";
    }
}
