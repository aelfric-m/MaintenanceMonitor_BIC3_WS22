package com.bic3.maintenancemonitor;

public class MessageHandler {
    private String defaultStatus = "Everything works as expected, nothing to worry, humans";
    private String currentStatus = "Everything works as expected, nothing to worry, humans";

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
