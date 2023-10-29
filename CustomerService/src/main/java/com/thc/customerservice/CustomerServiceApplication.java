package com.thc.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CustomerServiceApplication.class, args);

        System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
        System.out.println("\t\t\t\t\t\tBase Url: "+ getEvevironment(context,"server.url"));
        System.out.println("\t\t\t\t\t\tSwagger UI: "+ getEvevironment(context,"server.url")+"swagger-ui/index.html");
        System.out.println("\t\t\t\t\t\tH2 Database: "+ getEvevironment(context,"server.url")+"h2-console");
        System.out.println("\t\t\t\t\t\tUsername: "+ getEvevironment(context,"spring.datasource.username"));
        System.out.println("\t\t\t\t\t\tPassword: "+ getEvevironment(context,"spring.datasource.password"));
        System.out.println("\t\t\t\t\t\t-----------------------------------------------------");
    }

    public static String getEvevironment(ApplicationContext context, String config){
        return context.getEnvironment().getProperty(config, String.class);
    }

}
