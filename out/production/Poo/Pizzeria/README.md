# Pizzería
Programa que permite gestionar los pedidos de una pizzería durante un día. El programa debe permitir almacenar información sobre los pedidos y proporcionar funcionalidades para la gestión de los mismos.

**Estructura de datos:**

1. **Pizzeria**: Contendrá las siguientes características:
  - numeroPedidos: Número total de pedidos almacenados.
  - codigoPedidos: Contador que se incrementa con cada pedido, proporcionando un código único.
  - listaPedidos: Lista que almacena los pedidos realizados. Puede contener hasta 20 pedidos.

2. **Pedido**: Cada pedido tendrá las siguientes características.
- nombre: Nombre del cliente.
- telefono: Teléfono del cliente.
- codigoPedido: Código único del pedido, asignado automáticamente.
- numeroIngredientes: Número de ingredientes solicitados.
- ingredientes: Lista de ingredientes seleccionados para la pizza. Puede contener hasta 10 ingredientes.

3. **Ingredientes disponibles**: Los ingredientes estarán codificados de la siguiente manera:
   - 0 : Tomate
   - 1 : Queso
   - 2 : Nata
   - 3 : Cebolla
   - 4 : Pollo
   - 5 : Huevo
   - 6 : Salami
   - 7 : Anchoa
   - 8 : Bacon
   - 9 : Gamba
---
## Funcionalidades requeridas
1. inicializarPizzeria(): Funcionalidad para inicializar la estructura de la pizzería y preparar los pedidos. Si la pizzería tiene pedidos almacenados, se deben eliminar.
2. agregarPedido(): Permite al usuario agregar un nuevo pedido a la pizzería. El código de pedido se genera automáticamente.
3. eliminarPedido(): Elimina un pedido existente por su código.
4. buscarPedidoPorNombre(): Busca el pedido por el nombre del cliente.
5. ingredientePreferido(): Determina el ingrediente más solicitado del día.
6. mostrarPedidos(): Muestra todos los pedidos realizados.

---

### Requisitos adicionales
- El programa debe manejar un máximo de 20 pedidos en total y un máximo de 10 ingredientes por pedido.
- Debe validar la entrada de datos y manejar errores en caso de que los datos no sean correctos.
- Crear un menú principal que integre todas las funcionalidades.
