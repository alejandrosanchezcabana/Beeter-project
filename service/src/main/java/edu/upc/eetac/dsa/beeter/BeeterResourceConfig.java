package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Alex on 30/9/15.
 */
public class BeeterResourceConfig extends ResourceConfig{
    public BeeterResourceConfig() {
        final ResourceConfig rc = new ResourceConfig().packages("edu.upc.eetac.dsa.beeter");
    }
}
