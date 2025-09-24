package com.example.soap_server.dto;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "getMessageRequest", namespace = "http://example.com/demo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetMessageRequest {
  @XmlElement(name = "id", namespace = "http://example.com/demo")
  private int id;

  // getter/setter
  public int getId() { return id; }
  public void setId(int id) { this.id = id; }
}
