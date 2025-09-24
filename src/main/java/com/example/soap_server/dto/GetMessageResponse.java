package com.example.soap_server.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "getMessageResponse", namespace = "http://example.com/demo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetMessageResponse {
  @XmlElement(name = "message", namespace = "http://example.com/demo")
  private String message;

  // getter/setter
  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
}
