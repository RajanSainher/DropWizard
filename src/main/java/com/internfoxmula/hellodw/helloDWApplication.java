package com.internfoxmula.hellodw;


import com.internfoxmula.hellodw.resources.EmployeeRESTController;
import com.internfoxmula.hellodw.resources.helloReso;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class helloDWApplication extends Application<helloDWConfiguration> {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(helloDWApplication.class);

    public static void main(final String[] args) throws Exception {
        new helloDWApplication().run(args);
            
    }


    @Override
    public void initialize(final Bootstrap<helloDWConfiguration> bootstrap) {
        // TODO: application initialization
       
    }

    @Override
    public void run(final helloDWConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        LOGGER.info("Registering REST resources");
        //environment.jersey().register(new helloReso());
        environment.jersey().register(new EmployeeRESTController(environment.getValidator()));
        
        

}
}
