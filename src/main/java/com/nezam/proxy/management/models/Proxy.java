package com.nezam.proxy.management.models;


import javax.persistence.*;

@Entity
@Table(name="Proxy")
public class Proxy {

    public enum ProxyStatus {
        Active,
        Canceled
    }
    @Id
    @Column(name="PROXY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="PROXY_IP")
    private String proxyIp ;
    @Column(name="USERNAME")
    private String username ;
    @Column(name="PASSWORD")
    private String password ;
    @Column(name="HTTP_PORT")
    private int httpPort ;
    @Column(name="LOCATION")
    private String location ;
    @Column(name="SERVICE")
    private String service ;
    @Column(name="PLAN_ID")
    private int planID ;
    @Column(name="DUE_DATE")
    private int dueDate;
    @Column(name="PROXY_STATUS")
//    @Enumerated(EnumType.STRING)
    private Enum<ProxyStatus> status ;

    public Proxy() {
    }

    public Proxy(Long id, String proxyIp, String username, String password, int httpPort, String location, String service, int planID, int dueDate, Enum<ProxyStatus> status) {
        this.id = id;
        this.proxyIp = proxyIp;
        this.username = username;
        this.password = password;
        this.httpPort = httpPort;
        this.location = location;
        this.service = service;
        this.planID = planID;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProxyIp() {
        return proxyIp;
    }

    public void setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public Enum<ProxyStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<ProxyStatus> status) {
        this.status = status;
    }
}
