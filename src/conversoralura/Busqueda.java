
package conversoralura;

import java.net.URI;


public class Busqueda {
    
    public double busquedaMoneda(String base_code, String target_code){
        String  keyPag = "52bee537ce468bddbc79fd94";
        URI direccion = URI.create(" https://v6.exchangerate-api.com/v6/" + keyPag + "/latest/" + base_code);
    }
    
}
