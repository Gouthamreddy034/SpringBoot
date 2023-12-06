package com.example.accessrequest.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "sampleassessment")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Assesment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private int requestid;
    @Column(name = "cdsid")
    private String cdsid;
    @Column(name="name")
    private String name;
    @Column(name="application_name")
    private String applicationname;
    @Column(name="access_type")
    private String accesstype;
    @Column(name = "supervisor_cdsid")
    private String supervisorcdsid;
    @Column(name = "purpose")
    private String purpose;
    @Column(name="created_by")
    private String createdby;
    @Column(name="date")
    private String date;

    public int getRequestid() {
        return requestid;
    }

    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }

    public String getCdsid() {
        return cdsid;
    }

    public void setCdsid(String cdsid) {
        this.cdsid = cdsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicationname() {
        return applicationname;
    }

    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname;
    }

    public String getAccesstype() {
        return accesstype;
    }

    public void setAccesstype(String accesstype) {
        this.accesstype = accesstype;
    }

    public String getSupervisorcdsid() {
        return supervisorcdsid;
    }

    public void setSupervisorcdsid(String supervisorcdsid) {
        this.supervisorcdsid = supervisorcdsid;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Assesment{" +
                "requestid=" + requestid +
                ", cdsid='" + cdsid + '\'' +
                ", name='" + name + '\'' +
                ", applicationname='" + applicationname + '\'' +
                ", accesstype='" + accesstype + '\'' +
                ", supervisorcdsid='" + supervisorcdsid + '\'' +
                ", purpose='" + purpose + '\'' +
                ", createdby='" + createdby + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
