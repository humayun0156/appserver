package com.widespace.appserver.core;

import com.widespace.appserver.database.manager.DatabaseManager;
import com.widespace.appserver.models.WideSpaceApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.LinkedHashMap;

/**
 * @author humayun
 */
public class CacheManager {
    private final Logger logger = LoggerFactory.getLogger(CacheManager.class);
    private static final LinkedHashMap<String, WideSpaceApp> cache = new LinkedHashMap<>();
    private final DatabaseManager databaseManager;

    @Inject
    public CacheManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public WideSpaceApp getApp(String uuid) throws Exception {
        WideSpaceApp app;
        app = cache.get(uuid);
        if (app != null) {
            logger.trace("id : {} found in cache. So returning cached object.", uuid);
            return app;
        } else {
            app = databaseManager.getApp(uuid);
            if (app != null) {
                logger.trace("Insert Object to cache with id : {}", uuid);
                cache.put(uuid, app);
            }
            return app;
        }
    }
}
