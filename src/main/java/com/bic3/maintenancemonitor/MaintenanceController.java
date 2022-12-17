package com.bic3.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    private String defaultStatus = "Everything works as expected, nothing to worry, humans";
    private String currentStatus = "Everything works as expected, nothing to worry, humans";

    @GetMapping("/api/message")
    public String displayCurrentStatus() {
        return currentStatus;
    }


}
