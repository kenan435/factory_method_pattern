package com.kenan;

public class RegularLoggerCreator extends AbstractLoggerCreator {

    @Override
    public Logger createLogger() {

        final RegularLogger regularLogger = new RegularLogger();

        return regularLogger;

    }

}
