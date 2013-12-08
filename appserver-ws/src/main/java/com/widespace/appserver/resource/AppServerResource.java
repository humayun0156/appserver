package com.widespace.appserver.resource;

import com.widespace.appserver.core.CacheManager;
import com.widespace.appserver.models.WideSpaceApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author humayun
 */
@Path("/app")
public class AppServerResource {
    private final Logger logger = LoggerFactory.getLogger(AppServerResource.class);
    private final CacheManager cacheManager;

    @Inject
    public AppServerResource(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces({ MediaType.APPLICATION_JSON})
    public Response getAppStatus(@PathParam("id")@DefaultValue("")final String appUUID) {
        WideSpaceApp app;
        try {
            app = cacheManager.getApp(appUUID);
        } catch (Exception ex) {
            logger.trace("There is an exception in database server");
            return Response.status(400).entity("Unknown Error").build();
        }

        if (app != null) {
            return Response.status(200).entity(app).build();
        } else {
            String message = "There is no entry with id : " + appUUID;
            return Response.status(400).entity(message).build();
        }
    }
}
