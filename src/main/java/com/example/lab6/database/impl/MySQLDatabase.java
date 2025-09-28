package com.example.lab6.database.impl;

import com.example.lab6.database.IMyDatabase;

public class MySQLDatabase implements IMyDatabase {
    @Override
    public void connect() {
        System.out.println("My SQL connected");
    }
}
