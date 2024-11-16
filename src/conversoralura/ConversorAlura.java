
package conversoralura;

import java.util.Scanner;


public class ConversorAlura {

  
    public static void main(String[] args) {
        
        
        //ACÁ SE COLOCAN LAS VARIABLES DEL OBJETO//
        
        Busqueda consulta = new Busqueda();//CREA UN OBJETO DE LA CLASE BUSQUEDA//
        Scanner teclado = new Scanner(System.in);//ESTO CREA LA ENTRADAS DEL TECLADO DEL USUARIO//
        int eleccion = 0; //VARIABLE QUE ALMACENA LA OPCION SELECCIONADA//
        long valorFinal; //VALOR QUE ALMACENA EL RESULTADO DE LA CONVERSIÓN//
        
        while(eleccion != 7){// MANTIENE EL PROGRAMA SIEMPRE Y CUANDO EL USUARIO NO PRESIONE 7//
            System.out.println("-----------------------------------------");
            System.out.println("Bienvenido al conversor de moneda internacional XD");
            System.out.println("""
                               1. Dolar => Peso Argentino
                               2. Peso Argentino => Dolar
                               3. Dolar => Real Brazileño  //TEXTO DEL MENÚ DE OPCIONES//
                               4. Real Brazileño => Dolar
                               5. Dolar => Peso Colombiano
                               6. Peso Colombiano => Dolar
                               7. Salir"""); //SÍ PRESIONAN 7 SE ACABA EL PROGRAMA//
            
            
            System.out.println("Eliga un tipo de moneda");
            eleccion = teclado.nextInt();//COMO ES 0 POR LA VARIABLE ACÁ TOMARÁ LA OPCION DEL USUARIO//
            if ( eleccion == 7){
                break; //ACÁ SE ACABA LA OPERACIÓN//
            }
    
            System.out.println("Ingrese el valor a convertir");
            int cant = teclado.nextInt();// ALMACENA LA CANTIDAD EN VAR CANT//
            
            String baseCode = "",tarjetCode = "";
      }
        
        
    
 }
