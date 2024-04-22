package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBootの世界へ!";
    }
    @GetMapping("now")
    public String dispTime() {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        return "現在時刻 ： " + now;
    }
    
    @GetMapping("/plus/{va11}/{va12}")
    public String calcPlus(@PathVariable int va11, @PathVariable int va12) {
        int res = 0;
        res = va11 + va12;
        return "計算結果:" + res;
    }

}
