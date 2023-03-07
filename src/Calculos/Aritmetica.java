package Calculos;

import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        // Declaramos las variables a utilizar
        int n;
        double media,suma=0.0,desviacionEstandar=0.0,varianza=0.0;
        
        // Solicitamos y guadamos los datos proporcionados por el usuario
        System.out.print("Ingresa la cantidad de numeros que se van a calcular: ");
        n = entrada.nextInt();
        
        // Creamos un array para almacenar los datos proporcionados por el usuario
        double[] numeros = new double[n];
        
        // Pedimos al usuario cada uno de los datos y los guardamos en el array
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = entrada.nextDouble();
            suma+= numeros[i];
        }
        
        // Hacamos el calculo con la formula y mostramos el resulado de la media
        media = suma/n;
        System.out.println("La media aritmetica de los " + n+ " numeros es: " + media);
        
        // Recorremos el array para hacer las operaciones correspondientes
        for (int i = 0; i < n; i++) {
            desviacionEstandar += Math.pow(numeros[i] - media, 2);
        }
        
        // Hacamos el calculo con la formula y mostramos el resulado de la Desviacion Estandar y la varianza
        varianza = desviacionEstandar/n;
        desviacionEstandar = Math.sqrt(desviacionEstandar/n);
        
        //Mostramos el resultado en pantalla
        System.out.println("La Varianza de los " +n+ " numeros ingresados es "  + String.format("%.2f",varianza));
        System.out.println("La desviacion Estandar de los " +n+ " numeros ingresados es "  + String.format("%.2f",desviacionEstandar));
        
    }
}
