package com.example.soap_server.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.*;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(context);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(servlet, "/ws/*");
  }

  /**
   * wsdlを生成するためのBean定義
   */
//  @Bean(name = "demo")
//  public DefaultWsdl11Definition efaultWsdl11Definition(XsdSchema demoSchema) {
//    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
//    definition.setPortTypeName("DemoPort");
//    definition.setLocationUri("/ws");
//    definition.setTargetNamespace("http://example.com/demo");
//    definition.setSchema(demoSchema);
//    return definition;
//  }
//
//  @Bean
//  public XsdSchema demoSchema() {
//    return new SimpleXsdSchema(new ClassPathResource("schema1.xsd"));
//  }
}
