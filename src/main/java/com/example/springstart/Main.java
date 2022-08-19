package com.example.springstart;

import com.example.springstart.BackEnd.Voltage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Voltage battery = context.getBean("battery", Voltage.class);

        System.out.println(battery.getName());

        context.close();
        regergregregergergerg
    }
}
