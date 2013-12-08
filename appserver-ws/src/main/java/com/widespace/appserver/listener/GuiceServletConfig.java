package com.widespace.appserver.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.widespace.appserver.mapping.PersistenceModule;
import com.widespace.appserver.mapping.WidespaceGuiceConfig;

/**
 * @author humayun
 * @version 1.0
 */
public class GuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        Injector injector = Guice.createInjector(
                new PersistenceModule(),
                new WidespaceGuiceConfig()
                /*new ServiceInitialization(),
                new WidespaceGuiceConfig(),
                new ServiceModule(),
                new HttpGuiceModule(),
                new TransformationNPBuilderModule(),
                new TransformationEPiBuilderModule(),
                new ConfigModule()*/);


        return injector;
    }
}
