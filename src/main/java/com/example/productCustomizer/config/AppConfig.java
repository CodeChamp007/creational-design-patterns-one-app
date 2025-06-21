package com.example.productCustomizer.config;

public class AppConfig {

    private static AppConfig instance;

    private String curreny;
    private String environment;

    private AppConfig() {
        this.curreny = "USD";
        this.environment = "development";
    }

    public static synchronized AppConfig getInstance() {
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

    public String getCurreny() {
        return curreny;
    }

    public void setCurreny(String curreny) {
        this.curreny = curreny;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
