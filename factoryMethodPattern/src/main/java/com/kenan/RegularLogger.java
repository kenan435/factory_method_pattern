package com.kenan;

public class RegularLogger implements Logger {

    public void log( final String message ) {

        System.err.println( "regular_logging" );

    }

}
