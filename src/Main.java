//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.sql.*;
void main() throws  Exception{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

    // to see how IntelliJ IDEA suggests fixing it.
    String url = "jdbc:postgresql://localhost:5432/mark1";
    String user  = "postgres";
    String pass = "12345";
//    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url,user,pass);
    System.out.println("Con Working");
}
