package ua.kukhtar.gcpmetrics.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogGeneratorController {

    @GetMapping("log")
    public String generateLog(){
        log.info("test logs");

        return "Answer";
    }
}
