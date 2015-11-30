package com.kenan;

//ConcreteCreatorpublic 
public class XMLLoggerCreator extends AbstractLoggerCreator {

    @Override
    public Logger createLogger() {

        final XMLLogger logger = new XMLLogger();
        return logger;
    }
}
