package com.widespace.appserver.mapping;

import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.widespace.appserver.resource.AppServerResource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author humayun
 */
public class WidespaceGuiceConfig extends JerseyServletModule {

    @Override
    protected void configureServlets() {
        bind(AppServerResource.class);

        Map<String, String> params = new HashMap<>();
        params.put(ServletContainer.FEATURE_FILTER_FORWARD_ON_404, "true");
        params.put(ServletContainer.JSP_TEMPLATES_BASE_PATH, "/WEB-INF/jsp");

        filter("/*").through(GuiceContainer.class, params);

    }
}