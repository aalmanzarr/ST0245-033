
/**
 * Punto 1 taller1
 * 
 * @author Andres Almanzar Restrepo
 * @version 1.0
 */
public class Punto1
{
    //Declarar
    private int x;
    private int y;
    private int z;
    String ID;
        //Crear Nombre de el contador y el valor inicial
        public Punto1(String ID, int x){
            this.ID=ID;
            this.x=x;
            this.z=x;
        }
        //Incrementar de uno en uno el valor inicial "x"
        void incrementar () {
           x++;
           //llevar la cuenta de cuantos incrementos se hace
           y++;
             }
        //cuantos incrementos se han hecho
        int incrementos () {
             return y;
        }
        //Entrega informacion actual del contador. Nombre, valor inicial, incrementos  y valor actual
        public String toString(){
        return "Contador: "+"'"+ID+"'"+" Empezo en: "+z+" aumento " +y+" veces y ahora es: "+x;
        }     
    }

