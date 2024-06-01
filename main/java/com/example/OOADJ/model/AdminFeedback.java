package com.example.OOADJ.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "feedback")
public class AdminFeedback
{
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
    public String getFeedback_text() {
        return feedback_text;
    }
    public void setFeedback_text(String feedback_text) {
        this.feedback_text = feedback_text;
    }

}

