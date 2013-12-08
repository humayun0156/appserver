package com.widespace.appserver.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author humayun
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WideSpaceApp {
    @XmlElement(name = "id")
    private String uuid;
    @XmlElement
    private String status;

    public WideSpaceApp() {
        // This is required by the XML serialization stuff.
    }

    public WideSpaceApp(String uuid, String status) {
        this.uuid = uuid;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
