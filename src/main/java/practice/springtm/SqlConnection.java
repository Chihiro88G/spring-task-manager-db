package practice.springtm;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.io.*;

public class SqlConnection {
    
    public void sqlConnection () throws Exception {
        Connection con = null;
         try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/create_test", "root", "password");
           java.sql.Statement st = con.createStatement();
           String sql = "select * from Todo;";
           ResultSet result = st.executeQuery(sql);
   
           while(result.next()) {
             int id = result.getInt("id");
             String todo1 = result.getString("todo1");
             System.out.println("id = " + id);
             System.out.println("name = " + todo1);
           }
         } catch (SQLException ex) {
           System.out.println("MySQLへの接続に失敗しました。");
           System.out.println(ex);
         } finally {
           if(con != null) {
             con.close();
           }
         }
      }
}
