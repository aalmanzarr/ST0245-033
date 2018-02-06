
/**
 * Write a description of class PUNTO1 here.
 * 
 * @author Andres Almanzar 
 * @version 1.0
 *
 * Ayuda de Santiago Valencia y Santiago Hincapié 
 */
public class PUNTO3{
    public static void Permutaciones(String base){
        Permuta("",base);
    }
    public static void Permuta(String base, String j){
        if(j.length()==0){
            System.out.println(base);
        }else{
            for (int i = 0; i <j.length(); i++) {
                  Permuta(base + j.charAt(i), j.substring(0,i)+j.substring(i+1));
            }
        }
     
    }
}
