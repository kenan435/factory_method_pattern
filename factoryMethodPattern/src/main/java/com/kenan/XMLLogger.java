package com.kenan;

//concrete implementation of the Logger (Product) 
public class XMLLogger implements Logger {

    public void log( final String message ) {
        // log to xml
        System.err.println( "logging" );
    }
}
