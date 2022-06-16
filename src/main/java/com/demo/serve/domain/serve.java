package com.demo.serve.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.demo.serve.ServeStatus;


@Entity
public class serve {
    @Id @GeneratedValue
    Integer id ;
    Integer tableNo;
    //List<Integer> menus;
    Integer orderId;
    Integer storeId;
    Date sysDate;
    
   
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    /* 
    @OneToMany
    public List<Integer> getMenu() {
        return menus;
    }
    public void setMenu(List<Integer> menus) {
        this.menus = menus;
    }
    */
    public Integer getTableNo() {
        return tableNo;
    }
    public void setTableNo(Integer tableNo) {
        this.tableNo = tableNo;
    }
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Integer getStoreId() {
        return storeId;
    }
    public void setStoreId(Integer storeId) {
        this.storeId = storedId;
    }
    public Date getSysDate() {
        return sysDate;
    }
    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public ServeStatus serveStatus;

    public HoleFlag holeFlag;

    public HoleFlag getHoleFlag() {
        return holeFlag;
    }
    public void setHoleFlag(HoleFlag holeFlag) {
        this.holeFlag = holeFlag;
    }
    public ServeStatus getServeStatus() {
        return serveStatus;
    }
    public void setServeStatus(ServeStatus serveStatus) {
        this.serveStatus = serveStatus;
    }

    





    
}
