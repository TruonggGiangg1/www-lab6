package com.example.lab6.dao;

import com.example.lab6.database.IMyDatabase;

public class CustomerBusiness {
    private IMyDatabase database;

    // Constructor Injection
    public CustomerBusiness(IMyDatabase database) {
        this.database = database;
    }

    // ✅ thêm constructor mặc định (không tham số)
    public CustomerBusiness() {
    }

    // Setter Injection
    public void setDatabase(IMyDatabase database) {
        this.database = database;
    }

    public void getCustomer() {
        database.connect();
        System.out.println("Lấy dữ liệu khách hàng...");
    }
}
