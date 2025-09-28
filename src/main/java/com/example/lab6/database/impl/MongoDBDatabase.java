package com.example.lab6.database.impl;

import com.example.lab6.database.IMyDatabase;

public class MongoDBDatabase implements IMyDatabase {
    @Override
    public void connect() {
        System.out.println("MongoDB Database connected");
    }
}