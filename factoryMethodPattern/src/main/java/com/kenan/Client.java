package com.kenan;

/**
 * @author Kenan Karamehmedovic
 *
 */
public class Client {

    private void someMethodThatLogs( final AbstractLoggerCreator logCreator ) {

        final Logger logger = logCreator.createLogger();
        logger.log( "message" );
    }

    public static void main( final String[] args ) {

        // for the purposes of this example, create an XMLLoggerCreator
        // directly,
        // but this would normally be passed to constructor for use.

        final Client client = new Client();

        client.someMethodThatLogs( new XMLLoggerCreator() );

        client.someMethodThatLogs( new RegularLoggerCreator() );

    }
}
