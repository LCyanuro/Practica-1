import java.util.*;

class Introducir
{
    String nombre;
    int calificacion;

    public Introducir(String nombre, int calificacion)
    {
        setNombre(nombre);
        setCalific(calificacion);
    }
    //Setter
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCalific(int calificacion)
    {
        this.calificacion = calificacion;
    }
    //Getter
    public String getNombre()
    {
        return nombre;
    }
    public int getCalific()
    {
        return calificacion;
    }
}