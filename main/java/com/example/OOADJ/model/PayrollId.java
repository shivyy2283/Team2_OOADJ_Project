package com.example.OOADJ.model;
import java.io.Serializable;

public class PayrollId implements Serializable {
    private static final long serialVersionUID = 1L; // serialVersionUID field
    private String userId;
    private String payDay;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPayDay() {
        return payDay;
    }
    public void setPayDay(String payDay) {
        this.payDay = payDay;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}
