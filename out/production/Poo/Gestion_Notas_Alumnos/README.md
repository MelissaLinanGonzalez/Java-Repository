# Gestión de calificaciones de alumnos

---
Crear una aplicación que gestione las calificaciones de los estudiantes y realice cálculos estadísticos basados en esas calificaciones.

**Requisitos**
1. Clase Estudiante
   - Crear una clase llamada Estudiante con los siguientes atributos.
     - Un String para el nombre del estudiante.
     - Un Array Bidimensional de doubles para las calificaciones. El primer índice representará la materia (matemáticas, historia, etc.) y el segundo índice representará diferentes evaluaciones (por ejemplo, examenes, trabajos).
   - Métodos:
     - Un constructor que inicialice el nombre y un array bidimensional con dimensiones dadas.
     - Un método calcularPromedioMaterias() que devuelva un array de doubles con los promedios por materias.
     - Un método calcularPromedioGeneral() que devuelva un double representando el promedio general de estudiante.
     - Un método mostrarCalificaciones() que imprima todas las calificaciones del estudiante en un formato legible.

2. Clase GestorDeCalificaciones
   - Crear una clase llamada GestorDeCalificaciones con los siguiente métodos:
     - Un método para agregar estudiantes a una lista (utilizar una estructura de datos como ArrayList).
     - Un método que dado un estudiante, determine si su promedio general es menor que 5.0 y muestre un mensaje de alerta.
     - Un método que busque al estudiante con el mejor promedio general y muestre sus datos.

3. Entrada/Salida:
   - El programa debe interactuar con el usuario a través del teclado, permitiendo ingresar los nombres de los estudiante y sus calificaciones en diferentes materias.
   - Debe mostrar la información de manera clara y estructurada, incluyendo promedios y alertas.

**Especificaciones Detalladas:**
- Clase Estudiante:
  - El constructor debe recibir el nombre del estudiante y las dimensiones del array bidimensional (número de materias y número de evaluaciones).
  - El método calcularPromedioMaterias() debe calcular el promedio de cada materia, considerando todas la evaluaciones realizadas en esa materia.
  - El método calcularPromedioGeneral() debe calcular el promedio de todos los promedios por materia.
- Clase GestorDeCalificaciones:
  - La clase debe tener una lista (ArrayList) que almacene objetos de tipo Estudiante.
  - El método para agregar estudiantes debe pedir al usuario ingresar el nombre y las calificaciones del estudiante.
  - El método para determinar si un estudiante necesita alerta debe comparar el promedio general con 5.0 y mostrar un mensaje adecuado.
  - El método para encontrar al mejor estudiante debe recorrer la lista de estudiantes y encontrar aquel con el mayor promedio general.
- Entrada/Salida:
  - Utilizar System.out.println() y Scanner para interactuar con el usuario.
  - El programa debe mostrar un menú con opciones para agregar estudiantes, calcular promedios, mostrar alertar, buscar al mejor estudiante, etc.