import java.util.*;


public class Calificacion
{
    public static void main(String args[])
    {
        int i = 0;
        int indice = 0;

        Introducir[] la_lista;
        Introducir alumno_vacio = new Introducir("",0);
        la_lista = new Introducir[]{alumno_vacio};

        for(i=0;i<2;i++)
        {
            System.out.println();
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println();
            System.out.println("1.- Captura de nombre y calificaciones.");
            System.out.println("2.- Imprimir calificaciones y promedio de calificaciones.");
            System.out.println("3.- Imprimir calificaciones y calificación más baja.");
            System.out.println("4.- Imprimir calificaciones y calificación más alta.");
            System.out.println("5.- Salir");

            Scanner opcion = new Scanner(System.in);
            int eleccion = opcion.nextInt();

            if (eleccion == 1)
            {
                Introducir temp = new Introducir(CapturaEntrada.capturarCadena("Introduce el nombre: "), CapturaEntrada.capturarEntero("Introduce su calificacion"));
                la_lista[indice] = temp;
                la_lista = Arrays.copyOf(la_lista, la_lista.length + 1);
                indice = indice + 1;
                i=0;
            }
            else if (eleccion == 2)
            {
                System.out.println();
                imprimeCalificacion.impresora(la_lista,"media");
                System.out.println();
                i=0;
            }
            else if (eleccion == 3)
            {
                System.out.println();
                imprimeCalificacion.impresora(la_lista,"menor");
                System.out.println();
                i=0;
            }
            else if(eleccion == 4)
            {
                System.out.println();
                imprimeCalificacion.impresora(la_lista,"mayor");
                System.out.println();
                i=0;
            }
            else
            {
                System.out.println("Adieu...");
                System.exit(1);
            }
        }
    }
}