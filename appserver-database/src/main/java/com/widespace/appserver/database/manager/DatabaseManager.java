package com.widespace.appserver.database.manager;

import com.google.inject.persist.Transactional;
import com.widespace.appserver.database.models.AppStatus;
import com.widespace.appserver.models.WideSpaceApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author humayun
 */
public class DatabaseManager {
    private final Logger logger = LoggerFactory.getLogger(DatabaseManager.class);

    private Provider<EntityManager> emProvider;

    @Inject
    public DatabaseManager(Provider<EntityManager> emProvider) {
        this.emProvider = emProvider;
    }

    private EntityManager getEntityManager() {
        return emProvider.get();
    }

    @Transactional
    public WideSpaceApp getApp(String uuid) throws Exception {
        WideSpaceApp app = null;
        try {
            String sql = "SELECT a FROM AppStatus a WHERE a.appId = :uuid";
            List appList = getEntityManager()
                    .createQuery(sql)
                    .setParameter("uuid", uuid)
                    .getResultList();

            if (appList.size() > 0) {
                AppStatus appStatus = (AppStatus)appList.get(0);
                String id = appStatus.getAppId();
                boolean status = appStatus.isAppStatus();
                String flag = status  ? "enabled" : "disabled";
                app = new WideSpaceApp(id, flag);
                logger.trace("Found App id : {}, status : {}", uuid, flag);
            }
        } catch (Exception ex) {
            logger.error("There is an error to get data with id : {}", uuid);
            throw ex;
        }
        return app;
    }
}
