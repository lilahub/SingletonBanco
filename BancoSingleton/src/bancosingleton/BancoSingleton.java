package bancosingleton;

/**
 *
 * @author fslar
 */
public class BancoSingleton {

    public static void main(String[] args) {
        ConexaoBanco.getInstance().conectar();
        //outras informações
        
        ConexaoBanco.getInstance().desconectar();
        
    }
    
}
