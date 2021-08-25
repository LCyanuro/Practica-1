class imprimeCalificacion
{
    public static void impresora(Introducir arreglo[], String modo)
    {
        int j = 0;
        float retorno = 0;
        int menor  = arreglo[0].getCalific();
        int mayor = menor;
        //System.out.println("menor: " + menor);
        for (j = 0; j < arreglo.length - 1; j++)
        {
            System.out.println("Alumno " + (j + 1) + ": " + arreglo[j].getNombre());
            System.out.println("Calificacion: " + arreglo[j].getCalific());
            System.out.println("=================================================");
            if (modo == "media")
            {
                retorno = retorno + arreglo[j].getCalific();
            }
            else if (modo == "menor")
            {
                if (arreglo[j].getCalific() < menor)
                {
                    menor = arreglo[j].getCalific();
                }
            }
            else if (modo == "mayor")
            {
                if (arreglo[j].getCalific() > mayor)
                {
                    mayor = arreglo[j].getCalific();
                    System.out.println("mayor: " + mayor);
                }
            }
        }
        if (modo == "media")
        {
            System.out.println("==media: " + retorno / (arreglo.length - 1)+"==");
        }
        else if (modo == "menor")
        {
            System.out.println("==menor: " + menor+"==");
        }
        else if (modo == "mayor")
        {
            System.out.println("==mayor: " + mayor+"==");
        }

    }
}