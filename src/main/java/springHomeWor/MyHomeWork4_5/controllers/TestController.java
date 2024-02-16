package springHomeWor.MyHomeWork4_5.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springHomeWor.MyHomeWork4_5.services.TestService;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    TestService service =new TestService();
    @Autowired
    Map<String, Object> body;

    @PostMapping("/setobject")
    public boolean setObject(@RequestBody() Map<String, Object> body) {
        service.setObject(body);
        return true;
    }

    @GetMapping("/getObject")
    public Map<String, Object> getObject() {
        return service.getObject();
    }

    @GetMapping("/getLower")
    public Map<String, Object> getLower() {
        return service.getLower();
    }

    @GetMapping("/getUpper")
    public Map<String, Object> getUpper() {
        return service.getUpper();
    }
}
