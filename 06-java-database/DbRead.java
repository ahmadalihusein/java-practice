// Exercise 01 — Java reads from MySQL (the bridge!)
// This connects to your `practice1` database and prints the products,
// exactly like "SELECT * FROM products" — but driven from Java.
//
// RUN IT (note the -cp part that loads the MySQL driver):
//   java -cp "libs/mysql-connector-j-8.4.0.jar" 06-java-database/DbRead.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbRead {
    public static void main(String[] args) throws Exception {
        // 1) WHERE is the database? This "url" describes the address:
        //    jdbc:mysql:// = talk to MySQL, //localhost:3306 = this PC's MySQL,
        //    /practice1 = the database name.
        String url = "jdbc:mysql://localhost:3306/practice1";
        String user = "root";
        String password = "";   // XAMPP's default root password is blank

        // 2) OPEN the connection (the bridge to MySQL).
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to MySQL!");

        // 3) Create a Statement = a way to send SQL.
        Statement stmt = conn.createStatement();

        // 4) Run a SELECT. The rows come back inside a "ResultSet".
        ResultSet rs = stmt.executeQuery("SELECT * FROM products");

        


        // 5) rs.next() moves to the next row and returns false when there are
        //    no more rows. So this loop walks through every row — like a for-each.
        System.out.println("--- Products ---");
        while (rs.next()) {
            int id = rs.getInt("id");          // read the "id" column of this row
            String name = rs.getString("name"); // read the "name" column
            int price = rs.getInt("price");     // read the "price" column
            System.out.println(id + ". " + name + " - RM" + price);
            
        }

         System.out.println("---------");

              ResultSet rs1 = stmt.executeQuery("select * from products where price <= 3");  

                System.out.println("Food under RM3:");
        while(rs1.next()){
                
                int id1 = rs1.getInt("id");
                String name1 = rs1.getString("name");
                int price1 = rs1.getInt("price");
                System.out.println(id1 + ". " + name1 + " - RM" + price1);
            }

        System.out.println("---------");

        ResultSet rs2 = stmt.executeQuery("select * from products ORDER BY price ASC;");
  
                System.out.println("Price from low to high");
    while(rs2.next()){
               
                int id2 = rs2.getInt("id");
                String name2 = rs2.getString("name");
                int price2 = rs2.getInt("price");
                System.out.println(id2 + ". " + name2 + " - RM" + price2);
            } 

System.out.println("---------");

            ResultSet rs3 = stmt.executeQuery("select * from products");

            System.out.println("Display values in format");

            while(rs3.next()){

                int id3 = rs3.getInt("id");          // read the "id" column of this row
            String name3 = rs3.getString("name"); // read the "name" column
            int price3 = rs3.getInt("price");     // read the "price" column
            System.out.println("Products #" + id3 + ": " + name3 + " costs RM" + price3);

            }

        // 6) Always close the connection when done (frees resources).
        conn.close();
        System.out.println("Done.");
    }

}