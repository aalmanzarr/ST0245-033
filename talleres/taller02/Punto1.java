
/**
 * Write a description of class Punto1 here.
 * 
 * @author Andres Almanzar
 * @version 1.0
 */
public class Punto1{
   public static int Punto1(int x, int y){
        if(x%y==0){
            return y;
        }
        else
            return Punto1(y,x%y);    
    }
}
