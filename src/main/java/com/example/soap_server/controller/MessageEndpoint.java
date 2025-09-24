package com.example.soap_server.controller;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap_server.dto.GetMessageRequest;
import com.example.soap_server.dto.GetMessageResponse;

@Endpoint
public class MessageEndpoint {
  private static final String NAMESPACE_URI = "http://example.com/demo";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMessageRequest")
  @ResponsePayload
  public GetMessageResponse getMessage(@RequestPayload GetMessageRequest request) {
    GetMessageResponse response = new GetMessageResponse();
    response.setMessage("Hello, your id is " + request.getId());
    return response;
  }
}
