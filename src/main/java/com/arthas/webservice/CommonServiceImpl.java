package com.arthas.webservice;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

/**
 * webservice测试接口实现
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月19日 下午9:37:20
 */
@WebService(serviceName = "CommonService", // 与接口中指定的name一致
targetNamespace = "http://service.arthas.com", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.arthas.webservice.CommonService"// 接口地址
)
@Component
public class CommonServiceImpl implements CommonService {

    @Override
    public String sendMessage(String username) {
        
        return "hello "+username;
    }

}
