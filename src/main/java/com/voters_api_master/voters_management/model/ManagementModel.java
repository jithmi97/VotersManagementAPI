package com.voters_api_master.voters_management.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "voters_management_table",catalog = "management_db")
public class ManagementModel {

    @Id
    private long Voters_NIC;
    private String status;
    private Date registeredDate = new Date();
    public ManagementModel(){
        super();
    }

    public ManagementModel(long Voters_NIC,
                           String status, Date registeredDate) {
        this.Voters_NIC = Voters_NIC;
        this.status = status;
        this.registeredDate = registeredDate;
    }


    public long getVoters_NIC() {
        return Voters_NIC;
    }

    public void setVoters_NIC(long Voters_NIC) {
        this.Voters_NIC = Voters_NIC;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date launchedDate) {
        this.registeredDate = registeredDate;
    }
}
