/**
 * Punto 3 taller1
 * 
 * @author Andres Almanzar Restrepo
 * @version 1.0
 */
public class Punto3{
    int dia;
    int mes;
    int año;
    String fecha ="";
   //Crear fecha. 
    public Punto3(int dia, int mes, int año){
        if(dia>31||mes>12){
           System.out.print("ingrese una fecha valida");
        }
        else {
        this.dia = dia;
        this.mes = mes;
        this.año = año;   
    }
        }
    //mostrar dia
    public String dia () {
        return String.valueOf(dia);
    }      
    //mostrar mes
    public String mes() {
        return String.valueOf(mes);
    }      
    //mostrar año
    public String año () {
        return String.valueOf(año);
    }    
    //mostrar fecha
    public String fecha () {
        this.fecha=dia+"/"+mes+"/"+año;
        return dia+"/"+mes+"/"+año;
    }
    //Comparar fehcas
    public boolean compara (int dia2, int mes2, int año2){
        String fecha2=dia2+"/"+mes2+"/"+año2;
        //compara si es la misma fecha
        if(fecha.equals(fecha2)){;
        System.out.print("misma fecha");    
        return true;
    }
    
   //compara que fecha esta antes y cual despues
    if(año>año2){
    System.out.print(" la segunda fecha esta antes que la primera");
    }
     if(mes>mes2&&año>=año2){
    System.out.print(" la segunda fecha esta antes que la primera");
    }
     if(dia>dia2&&mes>=mes2&&año>=año2){
    System.out.print(" la segunda fecha esta antes que la primera");
    }
        if(año2>año){
    System.out.print(" la segunda fecha esta despues que la primera");
    }
     if(mes2>mes&&año2>=año){
    System.out.print(" la segunda fecha esta despues que la primera");
    }
     if(dia2>dia&&mes2>=mes&&año2>=año){
    System.out.print(" la segunda fecha esta despues que la primera");
    }
    return false;
    }
}
    