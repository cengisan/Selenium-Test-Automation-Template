package org.cengisan.enums;

public enum Driver {
    CHROMEDRIVER("webdriver.chrome.driver"),
    CHROMEPATH("resources/driver/chromedriver.exe");

    private final String driverInfo;
    Driver(String driverInfo){
        this.driverInfo = driverInfo;
    }
    public String getDriverInfo(){
        return driverInfo;
    }
}
