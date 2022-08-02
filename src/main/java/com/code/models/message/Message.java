package com.code.models.message;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*==================================== FIELDS ====================================================================*/
    private String text;
    /*recipient*/
    private Long recipientId;
    /*sender*/
    private String nameSender;
    private Long senderId;
    /*============================== CONSTRUCTORS ====================================================================*/
    public Message(){}
    /*=================================== GETTERS ====================================================================*/
    public Long getId() { return id; }
    public String getText() { return text; }
    public Long getRecipientId() { return recipientId; }
    public Long getSenderId() { return senderId; }
    public String getNameSender() { return nameSender; }
    /*=================================== SETTERS ====================================================================*/
    public void setId(Long id) { this.id = id; }
    public void setText(String text) { this.text = text; }
    public void setRecipientId(Long recipientId) { this.recipientId = recipientId; }
    public void setSenderId(Long senderId) { this.senderId = senderId; }
    public void setNameSender(String nameSender) { this.nameSender = nameSender; }
}
