package com.widespace.appserver.resource;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.widespace.appserver.models.WideSpaceApp;
import org.junit.Test;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
/**
 * @author humayun
 */
public class AppServerResourceTest extends JerseyTest {
    // a name of the package that contains classes implementing REST services.
    public static final String PACKAGE_NAME = "com.widespace.appserver.resource";
    private WebResource ws;
    private static String baseURL = "http://localhost:8080/appserver";

    private Map<String, String> map = new HashMap<>();

    public AppServerResourceTest() {
        super(new WebAppDescriptor.Builder(PACKAGE_NAME)
                .contextPath(baseURL).build());
        map.put("01a5cc04-ef5b-4440-9b5d-b4d3bc8eecc5", "enabled");
        map.put("06f785a4-faac-4a94-9041-51b408b79bae", "disabled");
        map.put("3d928097-8ce3-4dd9-a2ba-003ba2944894", "enabled");
    }

    @Test
    public void testExecuteService() {
        Client client = Client.create();
        ws = client.resource(baseURL).path("app").path("01a5cc04-ef5b-4440-9b5d-b4d3bc8eecc5");
        String expectedStatus = map.get("01a5cc04-ef5b-4440-9b5d-b4d3bc8eecc5");
        WideSpaceApp app = ws.get(WideSpaceApp.class);
        assertEquals("App Enabled", expectedStatus, app.getStatus());

        ws = client.resource(baseURL).path("app").path("06f785a4-faac-4a94-9041-51b408b79bae");
        expectedStatus = map.get("06f785a4-faac-4a94-9041-51b408b79bae");
        app = ws.get(WideSpaceApp.class);
        assertEquals("App Disabled", expectedStatus, app.getStatus());

        ws = client.resource(baseURL).path("app").path("3d928097-8ce3-4dd9-a2ba-003ba2944894");
        expectedStatus = map.get("3d928097-8ce3-4dd9-a2ba-003ba2944894");
        app = ws.get(WideSpaceApp.class);
        assertEquals("App Enabled", expectedStatus, app.getStatus());
    }
}
