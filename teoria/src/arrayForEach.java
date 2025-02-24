public class arrayForEach {
    public static void main(String[] args) {
        String[] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};

        //Recorremos la matriz con un bucle for normal:
        for (int i = 0; i < paises.length; i++) {
            System.out.println("País " + (i+1) + ": " + paises[i]);
        }
        System.out.println(":::::::::::::::::::::::::::");
        //Recorremos la matriz con un bucle for each: Te despreocupas de donde empieza y hasta donde llega.

        for (String item: paises){
            System.out.println("País: " + item);
        }
    }
}
