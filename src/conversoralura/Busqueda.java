
package conversoralura;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Busqueda {
    
    public double busquedaMoneda(String base_code, String target_code){
        String  keyPag = "52bee537ce468bddbc79fd94";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + keyPag + "/latest/" + base_code);
    
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder().uri(direccion).build();
        HttpResponse<String> response;
        
        try{
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Map<String, Object> responseMap = new Gson().fromJson(response.body(), Map.class);
            Map<String, Double> conversionRates = (Map<String, Double>) responseMap.get("conversion_rates");
            
            return conversionRates.get(target_code);
        }catch (Exception e){
            throw new RuntimeException("Error al obtener la tasa de conversion");
        }
        }
}
