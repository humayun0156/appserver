package com.widespace.appserver.listener;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.widespace.appserver.mapping.PersistenceModule;
import com.widespace.appserver.mapping.WidespaceGuiceConfig;

/**
 * @author humayun
 */
public class GuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        Injector injector = Guice.createInjector(
                new PersistenceModule(),
                new WidespaceGuiceConfig()
                );


        return injector;
    }
}
