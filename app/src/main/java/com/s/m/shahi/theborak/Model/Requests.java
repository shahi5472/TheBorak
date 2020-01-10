package com.s.m.shahi.theborak.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Requests implements Parcelable {
    private String id;
    private String name;
    private String url;
    private String description;
    private String data;
    private String dataOptions;
    private String dataMode;
    private List<HeaderData> headerData;
    private String method;
    private List<PathVariableData> pathVariableData;
    private List<QueryParams> queryParams;
    private Auth auth;
    private String events;
    private String folder;
    private String currentHelper;
    private HelperAttributes helperAttributes;
    private String collectionId;
    private String headers;
    private List<PathVariables> pathVariables;

    public Requests() {
    }

    protected Requests(Parcel in) {
        id = in.readString();
        name = in.readString();
        url = in.readString();
        description = in.readString();
        data = in.readString();
        dataOptions = in.readString();
        dataMode = in.readString();
        method = in.readString();
        events = in.readString();
        folder = in.readString();
        currentHelper = in.readString();
        collectionId = in.readString();
        headers = in.readString();
    }

    public static final Creator<Requests> CREATOR = new Creator<Requests>() {
        @Override
        public Requests createFromParcel(Parcel in) {
            return new Requests(in);
        }

        @Override
        public Requests[] newArray(int size) {
            return new Requests[size];
        }
    };

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataOptions() {
        return dataOptions;
    }

    public void setDataOptions(String dataOptions) {
        this.dataOptions = dataOptions;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public List<HeaderData> getHeaderData() {
        return headerData;
    }

    public void setHeaderData(List<HeaderData> headerData) {
        this.headerData = headerData;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<PathVariableData> getPathVariableData() {
        return pathVariableData;
    }

    public void setPathVariableData(List<PathVariableData> pathVariableData) {
        this.pathVariableData = pathVariableData;
    }

    public List<QueryParams> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<QueryParams> queryParams) {
        this.queryParams = queryParams;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getCurrentHelper() {
        return currentHelper;
    }

    public void setCurrentHelper(String currentHelper) {
        this.currentHelper = currentHelper;
    }

    public HelperAttributes getHelperAttributes() {
        return helperAttributes;
    }

    public void setHelperAttributes(HelperAttributes helperAttributes) {
        this.helperAttributes = helperAttributes;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public List<PathVariables> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(List<PathVariables> pathVariables) {
        this.pathVariables = pathVariables;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(url);
        dest.writeString(description);
        dest.writeString(data);
        dest.writeString(dataOptions);
        dest.writeString(dataMode);
        dest.writeString(method);
        dest.writeString(events);
        dest.writeString(folder);
        dest.writeString(currentHelper);
        dest.writeString(collectionId);
        dest.writeString(headers);
    }
}
