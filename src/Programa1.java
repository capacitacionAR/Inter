import java.util.ArrayList;
import java.util.Random;

public class Programa1 {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        ArrayList<Integer> interseccion = new ArrayList<Integer>();


        for(int i=0;i<30000;i++){
            lista1.add(r.nextInt(10000));
            lista2.add(r.nextInt(10000));
        }
        interseccion = new ArrayList<>(lista1);
        long inicio = System.currentTimeMillis();
        //for(Integer x: lista1)
        //    if (lista2.contains(x))
        //        interseccion.add(x);
        interseccion.retainAll(lista2);
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;

        System.out.println("Tamaño: " + interseccion.size());
        System.out.println("Tiempo "+ tiempo);
    }
}
//Tamaño: 28442
//Tiempo 925

//Tamaño: 28570
//Tiempo 415