package cloud.demo.ribbon;

import cloud.demo.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qianqian.sun 2018/5/16
 * 描述：
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
