package com.s.m.shahi.theborak.Model;

import java.util.List;

public class TheBorak {
    private String id;
    private String name;
    private String description;
    private String auth;
    private String events;
    private List<Variables> variables;
    private List<String> order;
    private List<FoldersOrder> folders_order;
    private List<ProtocolProfileBehavior> protocolProfileBehavior;
    private List<Folders> folders;
    private List<Requests> requests;

    public TheBorak() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public List<FoldersOrder> getFolders_order() {
        return folders_order;
    }

    public void setFolders_order(List<FoldersOrder> folders_order) {
        this.folders_order = folders_order;
    }

    public List<ProtocolProfileBehavior> getProtocolProfileBehavior() {
        return protocolProfileBehavior;
    }

    public void setProtocolProfileBehavior(List<ProtocolProfileBehavior> protocolProfileBehavior) {
        this.protocolProfileBehavior = protocolProfileBehavior;
    }

    public List<Folders> getFolders() {
        return folders;
    }

    public void setFolders(List<Folders> folders) {
        this.folders = folders;
    }

    public List<Requests> getRequests() {
        return requests;
    }

    public void setRequests(List<Requests> requests) {
        this.requests = requests;
    }
}
