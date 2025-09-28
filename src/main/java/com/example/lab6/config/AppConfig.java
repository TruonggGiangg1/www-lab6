package com.example.lab6.config;

import com.example.lab6.model.Address;
import com.example.lab6.model.Employee;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.lab6.model")
// Spring sẽ quét package để tìm @Component
public class AppConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Address address() {
        return new Address(); // chỉ khởi tạo object trống
    }

    @Bean
    public Employee employee() {
        return new Employee(); // object trống, dữ liệu set sau
    }
}