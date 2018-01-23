/**
 * Punto 2 taller1
 * 
 * @author Andres Almanzar Restrepo
 * @version 1.0
 */
public class Punto2
{
    //Declarar
    private float x;
    private float y;
    //Asiganar cordenadas a un punto
    public Punto2(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    //Hallar radio de un punto  = √(x)² +(y)²
    public float radio(){
        return (float) Math.sqrt((x*x)+(y*y));
    
    }
    //Hallar el agulo  
    float angulo(){
        return (float) Math.atan2(y,x);
    }
    //Hallar la distancia entre dos puntos = √(x2-x)² +(y2-y)²
    double distancia(double x2,double y2){
     return Math.sqrt((Math.pow((x2-x),2))+(Math.pow((y2-y),2)));
    }
}