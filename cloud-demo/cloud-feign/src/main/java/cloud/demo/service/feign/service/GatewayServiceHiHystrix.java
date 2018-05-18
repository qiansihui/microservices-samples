package cloud.demo.service.feign.service;

import org.springframework.stereotype.Component;

import java.text.MessageFormat;

/**
 * @author qianqian.sun 2018/5/16
 * 描述：
 */
@Component
public class GatewayServiceHiHystrix implements GatewayServiceHi {
    @Override
    public String callHiService(String name) {
        return MessageFormat.format("server-feign: hi {0} , Sorry service error!", name);
    }
}
