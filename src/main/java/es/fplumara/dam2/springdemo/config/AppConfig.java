package es.fplumara.dam2.springdemo.config;

import es.fplumara.dam2.springdemo.domain.AppInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    /*
     * Opción A (elige uno por defecto)
     * 
     * @Bean
     * 
     * @Primary
     * public AppInfo mainAppInfo() {
     * return new AppInfo("App PRINCIPAL", "1.0");
     * }
     * 
     * @Bean
     * public AppInfo secondaryAppInfo() {
     * return new AppInfo("App SECUNDARIA", "2.0");
     * }
     */

    /*
     * Opción B
     * 
     * @Bean("devInfo")
     * public AppInfo devInfo() {
     * return new AppInfo("App DEV", "0.1");
     * }
     * 
     * @Bean("prodInfo")
     * public AppInfo prodInfo() {
     * return new AppInfo("App PROD", "1.0");
     * }
     */

    // Opción C

    @Bean
    @Profile("dev")
    public AppInfo devInfo() {
        return new AppInfo("App DEV", "0.1");
    }

    @Bean
    @Profile("prod")
    public AppInfo prodInfo() {
        return new AppInfo("App PROD", "1.0");
    }
}