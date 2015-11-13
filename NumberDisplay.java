
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int valorActual;

   

    /**
     * Constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
     */
   public NumberDisplay (int limiteDisplay)
    {
        // initialise instance variables
        valorActual = 0;
     
    }

    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
     */
    public void setvalue(int valor)
    {
        // put your code here
       valorActual = valor;
    }
    
    /**
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
     */
    public  String getDisplayValue (int h, int m)
    {
     
       {
            
         String reloj = String.format("%02d,%02d", h, m);
       
         return reloj;
       
       }

   }
}
