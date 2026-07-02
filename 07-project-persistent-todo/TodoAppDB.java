// Capstone — Persistent To-Do App (Java + MySQL)
// Same app as project 04, but tasks are saved in the database.
//
// SETUP: start MySQL, and make sure the `tasks` table exists (see schema.sql).
// RUN:  java -cp "libs/mysql-connector-j-8.4.0.jar" 07-project-persistent-todo/TodoAppDB.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TodoAppDB {
    public static void main(String[] args) throws Exception {
        // ===== STAGE 1: connection + menu loop (given — read & run it) =====
        String url = "jdbc:mysql://localhost:3306/practice1";
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement stmt = conn.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Connected. Your tasks are saved in MySQL.");
        //ResultSet rs = ;

        while (true) {
            System.out.println();
            System.out.println("=== MY TO-DO LIST (saved in MySQL) ===");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Remove a task");
            System.out.println("5. Quit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                // ===== STAGE 2: Add a task -> INSERT =====
                
                System.out.println("Add task:- ");
                String taskname = scanner.nextLine();
                int values = stmt.executeUpdate("INSERT into tasks (name) values  ('"+ taskname + "')");
                
                System.out.println("Task added: " + taskname );
                

            } else if (choice.equals("2")) {
                // ===== STAGE 3: View tasks -> SELECT =====
                // Look at DbRead.java — executeQuery("SELECT * FROM tasks"),
                ResultSet rs = stmt.executeQuery("select * from tasks");
                // then while(rs.next()) read id, name, done and print each.
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    boolean done = rs.getBoolean("done");
                    String box = rs.getBoolean("done") ? "[x]" : "[ ]";
                    System.out.println(id + ". " + name + " " + box);
                }

            } else if (choice.equals("3")) {
                // ===== STAGE 4: Mark as done -> UPDATE =====
    
                ResultSet rs = stmt.executeQuery("select * from tasks");
                //boolean done = rs.getBoolean("done");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");   
                    String box = rs.getBoolean("done") ? "[x]" : "[ ]";
                    System.out.println(id + ". " + name + " " + box);
                }
                // Then ask which id, read it, and run an UPDATE:  
                System.out.print("Which task id to mark done? ");
                int chosen = Integer.parseInt(scanner.nextLine());
              
                int taskDone = stmt.executeUpdate("Update tasks set done  =  TRUE where id = " + chosen);
                
                System.out.println("Marked task " + chosen + " as done.");


            } else if (choice.equals("4")) {
                ResultSet rs = stmt.executeQuery("select * from tasks");
                //boolean done = rs.getBoolean("done");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");   
                    String box = rs.getBoolean("done") ? "[x]" : "[ ]";
                    System.out.println(id + ". " + name + " " + box);
                }
              System.out.print("Which task to remove? ");
                int chosen = Integer.parseInt(scanner.nextLine());

                String removeName = "";
                ResultSet rs1 = stmt.executeQuery("select name from tasks where id = " + chosen );
                if(rs1.next()){
                    removeName = rs1.getString("name");
                }

                int remove = stmt.executeUpdate("DELETE from tasks where id = " + chosen);
                
                System.out.println("Removed " + '"'+ removeName+ '"' + " from to-do list");


            } else if(choice.equals("5")){
                conn.close();   
                System.out.println("Saved. Bye! 👊");
                break;

            }else {
                System.out.println("Please type 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }
}
