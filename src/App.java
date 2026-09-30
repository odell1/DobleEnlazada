public class App {
    public static void main(String[] args) throws Exception {
        Cola doble=new Cola();
        doble.encolar('A');
        doble.encolar('B');
        doble.encolar('C');
         doble.encolar('C');
          doble.encolar('C');
        System.out.println("Imprimir.... ");
        doble.imprimeCola();
        System.out.println("Imprimiendo del revés.... ");
        doble.imprimeColaFinal();

        System.out.println("¡Los feos también tienen derecho !");


    }//main
}//Principal
