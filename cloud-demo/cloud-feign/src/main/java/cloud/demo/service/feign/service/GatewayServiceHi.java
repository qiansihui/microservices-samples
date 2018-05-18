package cloud.demo.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qianqian.sun 2018/5/16
 * 描述：
 */
@FeignClient(value = "service-hi", fallback = GatewayServiceHiHystrix.class)
public interface GatewayServiceHi {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String callHiService(@RequestParam(value = "name") String name);
}
