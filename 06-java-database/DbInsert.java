// Exercise 02 — Java WRITES to MySQL (INSERT)
// This time YOU write most of the code. The shell + instructions are here;
// the logic is yours.
//
// RUN IT (or use the green Run button now that libs is configured):
//   java -cp "libs/mysql-connector-j-8.4.0.jar" 06-java-database/DbInsert.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.protocol.Resultset;

public class DbInsert {
    public static void main(String[] args) throws Exception {
        // These are given (same as DbRead):
        String url = "jdbc:mysql://localhost:3306/practice1";
        String user = "root";
        String password = "";

        // ============================================================
        // YOUR JOB — write the code for each step below.
        //
        // STEP 1: open the connection.
        //   (look at DbRead.java line ~23 — it's the DriverManager.getConnection line)
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to MySQL!");
        // STEP 2: create a Statement from the connection.
        //   (DbRead line ~27)
        Statement stmt = conn.createStatement();
        // STEP 3: run an INSERT. THIS IS THE NEW PART — read the note below first.
        //   Insert a new product of your choice, e.g. ('Milo', 4).
        System.out.println("----");

        try{
            int rs = stmt.executeUpdate("INSERT into products (name, price) VALUES ('Milo', 4)");
        // STEP 4: print how many rows were added (see the note — executeUpdate
        //   gives you back that number).
        System.out.println("number of row(s) added: " + rs);
        
         } catch(SQLException e ){
            System.out.println(e.getMessage());
            System.out.println("Could not add - product already exists.");

        }

        System.out.println("----");
        // STEP 5: close the connection.
        //
        // Then run it, and run DbRead afterwards (or check phpMyAdmin) to SEE
        // your new product saved in the database permanently.
        // ============================================================
conn.close();
System.out.println("INSERT Done.");
        // ---------- THE ONE NEW THING YOU NEED ----------
        // For SELECT you used:   stmt.executeQuery(...)   -> returns a ResultSet (rows)
        // For INSERT/UPDATE/DELETE you use: stmt.executeUpdate(...)
        //      -> returns an int = how many rows were changed.
        //
        // Example shape:
        //   int rows = stmt.executeUpdate("INSERT INTO products (name, price) VALUES ('Milo', 4)");
        //   System.out.println(rows + " row(s) added.");
        // -------------------------------------------------
    }
}
