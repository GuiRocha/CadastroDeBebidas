package atividade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class conexaoBanco {
public static Connection obterConexao(){
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancojdbc","root","");
        
            System.out.println("Banco de dados conectado com sucesso");
        } 
        catch (SQLException e) {
        
            System.out.println("N�o foi possivel a conex�o com o banco de dados");
            
            e.printStackTrace();
        }
    return con;
    }



}
