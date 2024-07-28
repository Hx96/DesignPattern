package com.example.demo.architecture.authorizer;

import com.example.demo.architecture.entities.PermissionHandler;
import lombok.Data;

@Data
public class Permissions implements PermissionHandler {

    String resource;

    String allow;

    @Override
    public void handlePermission() {

    }
}
