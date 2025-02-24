/*Clase que procese pagos.
* Cada metodo de pago funciona de manera diferente
* ¿Como puedo asegurarme de que todos los metodos de pago sigan unas reglas basicas u obligatorias?*/

public interface ejercicioExam { /*Esto es como un contrato que hace que las demás tengan que cumplir esto si o si*/
    public void Pagar();
    public void Cancelar();

}
