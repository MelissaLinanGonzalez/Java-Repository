package Examen;

public class MainFracciones {
    public static void main(String[] args) {

        //Se crean 4 fracciones
        Fraccion f1 = new Fraccion(1,4);
        Fraccion f2 = new Fraccion(1,2);
        Fraccion f3 = new Fraccion();
        Fraccion f4 = new Fraccion(4);

        // Operaciones aritméticas con fracciones
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);

        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);

        System.out.println("");
        System.out.println("*** FRACCIÓN SIMPLIFICADA ***");

        //Suma simplificada
        FraccionSimplificada simplificarSuma = new FraccionSimplificada(suma.getNum(), suma.getDen());
        FraccionSimplificada sumaSimplificada = simplificarSuma.simplificar();

        //Resta simplifiacada
        FraccionSimplificada simplificarResta = new FraccionSimplificada(resta.getNum(), resta.getDen());
        FraccionSimplificada restaSimplificada = simplificarResta.simplificar();

        //Producto simplificado
        FraccionSimplificada simplificarMultiplicacion = new FraccionSimplificada(producto.getNum(), producto.getDen());
        FraccionSimplificada productoSimplificada = simplificarMultiplicacion.simplificar();

        //Cociente simplificado
        FraccionSimplificada simplificarCociente = new FraccionSimplificada(cociente.getNum(), cociente.getDen());
        FraccionSimplificada cocienteSimplificada = simplificarCociente.simplificar();

        System.out.println(f1 + " + " + f2 + " = " + sumaSimplificada);
        System.out.println(f1 + " - " + f3 + " = " + restaSimplificada);
        System.out.println(f1 + " * " + f4 + " = " + productoSimplificada);
        System.out.println(f1 + " / " + f2 + " = " + cocienteSimplificada);

        //Creamos la ultima fraccion para simplificar:
        FraccionSimplificada prueba = new FraccionSimplificada(6,2);
        FraccionSimplificada pruebaSimplificada = prueba.simplificar();
        System.out.println("");
        System.out.println("Muestro una fraccion: " + prueba.getNum() + "/" + prueba.getDen() + " y ahora la simplifico obteniendo: " + pruebaSimplificada.getNum() + "/" + pruebaSimplificada.getDen());

    }
}
