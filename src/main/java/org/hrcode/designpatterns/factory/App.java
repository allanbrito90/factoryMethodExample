package org.hrcode.designpatterns.factory;

import static java.util.Objects.isNull;

public class App
{
    private static Transport transport;
    public static void main( String[] args )
    {
        configure(args[0]);
        if(!isNull(transport)){
            runTransport();
        }

    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        transport = switch(type){
          case "uber" -> new CarTransport();
          case "log" -> new MotorcycleTransport();
          case "bike" -> new BikeTransport();
            default -> null;
        };
    }
}
