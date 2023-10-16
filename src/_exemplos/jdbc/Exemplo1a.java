package _exemplos.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Exemplo1a {
    
    // URL do banco de dados 
   static final String DATABASE_URL = "jdbc:mysql://localhost/sgcm_prof";
   // usuário
   static final String USER = "root";
   // senha
   static final String PASS = "1234";
   
    public static void main(String[] args) throws SQLException {
        
        // gerencia a conexão
       Connection connection = null;
       // estabelece uma conexão com o banco de dados
       connection = DriverManager.getConnection( DATABASE_URL, USER, PASS );
       
       // meio para instrução SQL
       Statement statement = null;
       // cria Statement para executar SQL no banco de dados
       statement = connection.createStatement();
       
       // executa códio SQL no banco de dados
       statement.execute("INSERT INTO especialidades VALUES (6, 'Cirurgia Cardiovascular')");
//        statement.execute("DELETE FROM especialidades WHERE codigo_especialidade = 6");
        
    }
    
}