package com.example.OOADJ.model;

import jakarta.persistence.*;
@Entity
@Table(name = "feedback")
public class EmployeeFeedback {
    @Id
    @Column(name="feedbackID")
    public int feedbackID;
    @Column(name="keywords")
    private String keywords;
    @Column(name="addressed_to_dept")
    private String addressed_to_dept;
    @Column(name="uploaded_by")
    public String uploaded_by;
    @Column(name="anonymous")
    private int anonymous;
    @Column(name="feedback_text")
    private String feedback_text;
    public EmployeeFeedback()
    {

    }
    public EmployeeFeedback(int feedbackID, String keywords, String addressed_to_dept, String uploaded_by, int anonymous, String feedback_text) {
        super();

        this.feedbackID = feedbackID;
        this.keywords = keywords;
        this.addressed_to_dept = addressed_to_dept;
        this.uploaded_by = uploaded_by;
        this.anonymous = anonymous;
        this.feedback_text = feedback_text;
    }



    public int getFeedbackID() {
        return feedbackID;
    }
    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public String getAtd() {
        return addressed_to_dept;
    }
    public void setAtd(String addressed_to_dept) {
        this.addressed_to_dept = addressed_to_dept;
    }
    public String getUb() {
        return uploaded_by;
    }
    public void setUb(String uploaded_by) {
        this.uploaded_by = uploaded_by;
    }
    public int getAnon() {
        return anonymous;
    }
    public void setAnon(int anonymous) {
        this.anonymous = anonymous;
    }


    public String getFeedback_text() {
        return feedback_text;
    }
    public void setFeedback_text(String feedback_text) {
        this.feedback_text = feedback_text;
    }
    public String getAddressed_to_dept() {
        return addressed_to_dept;
    }
    public void setAddressed_to_dept(String addressed_to_dept) {
        this.addressed_to_dept = addressed_to_dept;
    }
    public String getUploaded_by() {
        return uploaded_by;
    }
    public void setUploaded_by(String uploaded_by) {
        this.uploaded_by = uploaded_by;
    }
    public int getAnonymous() {
        return anonymous;
    }
    public void setAnonymous(int anonymous) {
        this.anonymous = anonymous;
    }

}



