package _exemplos.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Exemplo2a {
    
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
       // gerencia resultados
       ResultSet resultSet = null; 
       
       // execulta o códio SQL de consulta  no banco de dados
        resultSet = statement.executeQuery( "select * from especialidades" );

        // processa os resultados da consulta
        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        
        for(int i = 1; i <= numberOfColumns; i++) {
             System.out.print( metaData.getColumnLabel( i ) + " " );
        }
        System.out.println("");
        
        while( resultSet.next() ) {
            for(int i = 1; i <= numberOfColumns; i++) {
                System.out.print( resultSet.getObject( i ) + " " );
            }
            System.out.println("");
        }
        
    }
    
}