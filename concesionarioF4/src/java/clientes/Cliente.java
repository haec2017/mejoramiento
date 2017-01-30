/*Esta es el manage Bean */
package clientes;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/** * @author Hector Erazo
 */
@Named(value = "cliente")
@RequestScoped
public class Cliente {

    /**
     * Creates a new instance of Cliente
     */
    public Cliente() {
    
    }
    
}
