import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


 class Conexao {

     private static final String URL = "jdbc:mysql://localhost:3306/bd";
     private static final String USUARIO = "app_user";
     private static final String SENHA = "senha123";


    public static Connection getConexao() throws SQLException {
     return DriverManager.getConnection(URL,USUARIO, SENHA);
    }
  }


