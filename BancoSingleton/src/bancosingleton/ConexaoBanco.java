/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosingleton;
import java.sql.Connection;
/**
 *
 * @author fslar
 */
public class ConexaoBanco {
    private Connection conexao;
    private String nomeBanco;
    
    private static ConexaoBanco instancia;
    
    private ConexaoBanco(){
        //iniciar driver
        //nome, usuario, senha, ip
    }
    
    public static synchronized ConexaoBanco getInstance(){
        if(instancia == null){
            instancia = new ConexaoBanco();
        }
        return instancia;
    }
    
    public void conectar(){
        System.out.println("conectei");
    }
    
    public void desconectar(){
        System.out.println("desconectei");
    }
    
    //demais getters
    
}
