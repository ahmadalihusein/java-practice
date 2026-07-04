package com.ahmad.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/myURL")

    public String hello(){
        return "Hello from me!";
    }

    @GetMapping("/task")
    public List<String> getTasks() throws Exception{
        List<String> taskNames = new ArrayList<>();
        
        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");

        PreparedStatement ps = conn.prepareStatement("select * from tasks");
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            taskNames.add(rs.getString("name"));
        }
        conn.close();
        return taskNames;

  }
}


