package com.k8s.test.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZonedDateTime;


@RestController
@Slf4j
public class TestController {


    @GetMapping(path = "/show-host")
    public String showHostName() throws UnknownHostException {
        log.info("showHostName");
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostName();
    }

    @GetMapping(path = "/live")
    public String live(){
        return "SUCCESS";
    }

    @GetMapping(path = "/ready")
    public String ready(){
        return "SUCCESS";
    }

    @GetMapping(path = "/write-tmp")
    public String writeTmpFile() throws Exception {

        File tmpFile = new File("/tmp-dir/tmp");
        if(!tmpFile.exists()){
            boolean result = tmpFile.createNewFile();
            log.info("result: {}", result);
        }

        FileOutputStream fos = new FileOutputStream(tmpFile);
        fos.write("Test\n".getBytes());
        fos.close();

        return "SUCCESS";
    }

    @GetMapping(path = "/now-zone")
    public String nowZone(){
        return System.getProperty("user.timezone");
    }

}
