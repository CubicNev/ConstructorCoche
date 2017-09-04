/*
AUTOR: J. Carlos Nevarez Tovar 5IM6
VERSIÓN: 1.0 
DESCRIPCIÓN: Primer ejemplo en clase Coche.
COMPILACIÓN: Se compila en tiempo de ejecución. 
EJECUCIÓN: Ejecutando la clase principal.
*/
package constructorcarro;

/**
 * <h2>Clase Coche</h2>
 * <p>Primer ejemplo con uso de constructores</p>
 * @author J. Carlos Nevarez
 * @version v1.0.0
 * @since 01/09/2017
 */
public class Coche {
    
    //Campos de la clase
    private String gasolina;
    private String color;
    private int año;
    
    /**
     * <h3>Constructor default</h3>
     * <p>A los contructores defult no se les agrega argumentos(parametros)</p>
     */
    public Coche(){
        
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado para indicar gasolina</h3>
     * <p>Ejmeplo dado en clase pra abastecer de gasolina</p>
     * @param gasolina Parametro que define si el coche tiene gasolina o no;
     */
    public Coche(String gasolina){
        this.gasolina = gasolina;
        this.color = "Rojo";
        this.año = 2015;
        
        if(this.gasolina.equals("Gasolina"))
        {
            System.out.println("Avanza");
        }
        else
        {
            System.out.println("Descompuesto");
        }
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado</h3>
     * @param gasolina PArametro que define si el coche tiene gasolina o no;
     * @param color Parametro que indica el color de un coche
     * @param año Parametro que indica el año del modelo del coche
     */
    public Coche(String gasolina, String color, int año){
        this.gasolina = gasolina;
        this.color = color;
        this.año = año;
    }//Cierre del constructor
    
    /**
     * <h3>Constructor sobrecargado con un parametro default</h3>
     * @param color Parametro que indica el color de un coche
     * @param año Parametro que indica el año del modelo del coche
     */
    public Coche(String color, int año){
        this.gasolina = "Gasolina";
        this.color = color;
        this.año = año;
    }//Cierre del constructor
}//Cierre de la clase Coche
