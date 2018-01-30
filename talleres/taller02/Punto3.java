/**
 * Write a description of class Punto3 here.
 * 
 * @author Andres Almanzar
 * @version 1.0
 */
public class Punto3{
    public static void Combinaciones(String base){
        Punto3(base,"");
   }
   static void Punto3(String base,String j){
       if(base.length()==0){
           System.out.print(j+" ");
       }else{
           Punto3(base.substring(1),j + base.substring(0,1));
           Punto3(base.substring(1),j);
       }
    }
}