/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.InputStream;

/**
 *
 * @Gruppe 2 Silas, Thomas, Christian, Martin, Ib
 */
public class Project {

    int proID;
    int proEmpID;
    int proParID;
    String proName;
    String proStartDate;
    String proEndDate;
    InputStream proPeo;
    int proStatus;
    int proSteps;
    int proReqFunds;
    int proFunds;

    public Project(){
    
    
    } 
    
    
    public Project(int proID, int proEmpID, int proParID, String proName, String proStartDate, String proEndDate, int proReqFunds) {
        this.proID = proID;
        this.proEmpID = proEmpID;
        this.proParID = proParID;
        this.proName = proName;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
        this.proReqFunds = proReqFunds;
    }

    public Project(int proID, int proEmpID, int proParID, String proName, String proStartDate, String proEndDate, InputStream proPeo, int proStatus, int proSteps, int proReqFunds, int proFunds) {
        this.proID = proID;
        this.proEmpID = proEmpID;
        this.proParID = proParID;
        this.proName = proName;
        this.proStartDate = proStartDate;
        this.proEndDate = proEndDate;
        this.proPeo = proPeo;
        this.proStatus = proStatus;
        this.proSteps = proSteps;
        this.proReqFunds = proReqFunds;
        this.proFunds = proFunds;
    }
    
    
    

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public int getProEmpID() {
        return proEmpID;
    }

    public void setProEmpID(int proEmpID) {
        this.proEmpID = proEmpID;
    }

    public int getProParID() {
        return proParID;
    }

    public void setProParID(int proParID) {
        this.proParID = proParID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProStartDate() {
        return proStartDate;
    }

    public void setProStartDate(String proStartDate) {
        this.proStartDate = proStartDate;
    }

    public String getProEndDate() {
        return proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }

    public InputStream getProPeo() {
        return proPeo;
    }

    public void setProPeo(InputStream proPeo) {
        this.proPeo = proPeo;
    }

    public int getProStatus() {
        return proStatus;
    }

    public void setProStatus(int proStatus) {
        this.proStatus = proStatus;
    }

    public int getProSteps() {
        return proSteps;
    }

    public void setProSteps(int proSteps) {
        this.proSteps = proSteps;
    }

    public int getProFunds() {
        return proFunds;
    }

    public void setProFunds(int proFunds) {
        this.proFunds = proFunds;
    }

    public int getProReqFunds() {
        return proReqFunds;
    }

    public void setProReqFunds(int proReqFunds) {
        this.proReqFunds = proReqFunds;
    }

}
