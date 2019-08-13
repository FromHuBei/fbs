package com.fbs.service.entity;

public class Message extends BaseEntity {
    private Integer id;
    private String status;
    private String pipelineNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPipelineNumber() {
        return pipelineNumber;
    }

    public void setPipelineNumber(String pipelineNumber) {
        this.pipelineNumber = pipelineNumber;
    }
}
