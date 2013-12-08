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





    /*@Transactional
    public void insertUtil() throws Exception {
        System.out.println("we are here() method");
        for (int i = 0; i < 100; i++) {
            UUID id = UUID.randomUUID();
            boolean status = new Random().nextBoolean();
            System.out.println(id + " " + status);
            insertTable(id.toString(), status);
        }
    }

    @Transactional
    public void insertTable(String uuid, boolean appStatus) {
        try {
            AppStatus app = new AppStatus();
            app.setAppId(uuid);
            app.setAppStatus(appStatus);
            System.out.println("hmm");
            getEntityManager().persist(app);
            System.out.println("hmm-1");
            if (logger.isTraceEnabled()) {
                logger.trace("Successfully inserted. Id : {} , status : {}", app.getAppId(), app.isAppStatus());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }*/
}
