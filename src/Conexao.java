import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


 class Conexao {

     private static final String URL = "jdbc:mysql://localhost:3306/bd";
     private static final String USUARIO = "root";
     private static final String SENHA = "admin";


    public static Connection getConexao() throws SQLException {
     return DriverManager.getConnection(URL,USUARIO, SENHA);
    }
  }


