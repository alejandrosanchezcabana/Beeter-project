package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 * Created by Alex on 30/9/15.
 */
public class BeeterResourceConfig extends ResourceConfig {
    public BeeterResourceConfig() {
        packages("edu.upc.eetac.dsa.beeter");
        packages("edu.upc.eetac.dsa.beeter.auth");
        register(RolesAllowedDynamicFeature.class);
    }
}