package com.example.lab6;

import com.example.lab6.config.AppConfig;
import com.example.lab6.model.Address;
import com.example.lab6.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBai2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Lấy bean employee
        Employee emp = context.getBean(Employee.class);
        emp.setId(101);
        emp.setName("Nguyen Van A");

        Address addr = context.getBean(Address.class);
        addr.setCity("HCM");
        addr.setState("South");
        addr.setCountry("Vietnam");

        emp.setAddress(addr);

        // Test
        emp.showInfo();
    }
}
