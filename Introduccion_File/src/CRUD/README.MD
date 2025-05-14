## Ejercicio CRUD + JSON: Gestor de COntactos con Jackson

### Enunciado:
Desarrolla una aplicación de consola en Java para gestionar una agenda de contactos simple que permita:
1. **Añadir** nuevos contactos con nombre, telefono y email
2. **Eliminar** contactos existentes
3. **Buscar** contactos por nombre
4. **Listar** todos los contactos almacenados
5. **Guardar** la agenda en un archivo JSON utilizando la biblioteca Jackson

La aplicación debe cargar datos existentes al iniciar y guardar la información al salir.

--- 

### Ejemplo de salida
== GESTOR DE CONTACTOS ==
1. Agregar contacto
2. Eliminar contacto
3. Buscar contacto
4. Listar todos los contactos
5. Guardar y salir

Elige una opción: 4

-- TODOS LOS CONTACTOS --

Contacto{nombre='Alejando', telefono='687541203', email='alejandro@gmail.com'}

Contacto{nombre='Amparo', telefono='687456982', email='amparo@gmail.com'}

---

### Conceptos
* Mapeo objeto-JSON con Jackson
* Serialización y deserialización de objetos Java
* Lectura y escritura de archivos JSON
* Implementación de operaciones CRUD básicas