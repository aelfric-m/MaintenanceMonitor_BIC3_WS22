package com.bic3.maintenancemonitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    private MessageHandler messageHandler = new MessageHandler();

    @GetMapping("/api/message")
    public String displayCurrentStatus() {
        return messageHandler.getCurrentStatus();
    }

    @GetMapping("/api/message/set")
    public String setMessage(String m) {
        messageHandler.setCurrentStatus(m);
        return "ok";
    }

    @GetMapping("/api/message/reset")
    public String resetMessage() {
        messageHandler.setCurrentStatus(messageHandler.getDefaultStatus());
        return "ok";
    }
}
