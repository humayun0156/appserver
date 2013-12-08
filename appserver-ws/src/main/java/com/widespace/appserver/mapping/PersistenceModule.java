package com.widespace.appserver.mapping;

import com.google.inject.Scopes;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;
import com.widespace.appserver.core.CacheManager;
import com.widespace.appserver.database.manager.DatabaseManager;

/**
 * @author humayun
 */
public class PersistenceModule extends ServletModule {

    @Override
    protected void configureServlets() {
        bind(DatabaseManager.class).in(Scopes.SINGLETON);
        bind(CacheManager.class).in(Scopes.SINGLETON);

        JpaPersistModule jpaPersistModule = new JpaPersistModule("appserver-jpa");
        install(jpaPersistModule);
        filter("/*").through(PersistFilter.class);
    }
}
