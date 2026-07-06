package com.ahmad.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/task/count")
    public int getTaskCount() throws Exception{

        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");

        PreparedStatement ps = conn.prepareStatement("SELECT count(*) as total from tasks");
        ResultSet rs = ps.executeQuery();

        int count = 0;
        if(rs.next()){
            count = rs.getInt("total");
        }
        conn.close();
        return count;
    }

    @GetMapping("/task/{id}")
    public String getOneTask(@PathVariable int id) throws Exception {
        String result = "Not Found.";
        
        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");

        PreparedStatement ps =conn.prepareStatement("SELECT name from tasks where id = (?)");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            result = rs.getString("name");
        }
        conn.close();
        return result;
    }

    @PostMapping("/task/add")
    public String addTask(@RequestParam String name) throws Exception{

        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");

        PreparedStatement ps = conn.prepareStatement("INSERT INTO tasks (name) VALUES (?)");
        ps.setString(1, name);
        ps.executeUpdate();

        conn.close();
        return "Added: " + name;
    }

    @DeleteMapping("/task/{id}")
    public String deleteTask(@PathVariable int id) throws Exception{
        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");

        PreparedStatement ps = conn.prepareStatement("DELETE from tasks where id = (?)");
        ps.setInt(1, id);
        int row = ps.executeUpdate();

        if(row > 0){
            return "Deleted task " + id;
        } else{
            return "No task with id " + id;
        }

    }
}


