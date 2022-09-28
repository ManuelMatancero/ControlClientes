
package test;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.util.List;


public class test {
    public static void main(String[] args) {
        
        
        
      
        Cliente cliente = new Cliente(1, "Josefina", "Nullable", "jose@mail.com", "809-555-8889", 5000);
        ClienteDaoJDBC clienteDao = new ClienteDaoJDBC();
        int numero = clienteDao.actualizar(cliente);
        System.out.println("numero = " + numero);
        
    }
   
}
