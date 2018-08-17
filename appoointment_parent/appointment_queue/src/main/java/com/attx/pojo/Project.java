package com.attx.pojo;

import java.util.Date;

public class Project {
    private Integer proId;

    private String name;

    private Date startTime;

    private Date endTime;

    private String administrator;

    private Integer groupNum;

    private String allGroup;

    private String groupData;

    private Integer status;

    private Integer isdelete;

    private String address;

    private String featuress;

    private String url;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator == null ? null : administrator.trim();
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public String getAllGroup() {
        return allGroup;
    }

    public void setAllGroup(String allGroup) {
        this.allGroup = allGroup == null ? null : allGroup.trim();
    }

    public String getGroupData() {
        return groupData;
    }

    public void setGroupData(String groupData) {
        this.groupData = groupData == null ? null : groupData.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFeaturess() {
        return featuress;
    }

    public void setFeaturess(String featuress) {
        this.featuress = featuress == null ? null : featuress.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}