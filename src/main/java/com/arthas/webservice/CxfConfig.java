package com.arthas.webservice;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * cxf配置
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月19日 下午9:38:24
 */
@Configuration
public class CxfConfig {
    
    @Autowired
    private Bus bus;
    
    @Autowired
    private CommonService commonService;
    
    @Bean
    public Endpoint endpoint(){
// 这里相当于把Commonservice接口发布在了路径/services/CommonService下,wsdl文档路径为http://localhost:8080/services/CommonService?wsdl
        EndpointImpl endpoint = new EndpointImpl(bus, commonService);
        endpoint.publish("/CommonService");
        return endpoint;
    }
}
