# Dispositivos electrónicos

---
Se quiere modelar un sistema de **dispositivos electrónicos** con una jerarquía de clases. Existen **dispositivos generales** y **dispositivos con batería**, que pueden descargarse con el uso.

### 1. Define la clase base "Dispositivos" con los siguientes requisitos:
- **Atributos** (privados):
  - **nombre** (tipo String).
  - **consumoPorUso** (tipo int), que representa el consumo de batería o energía por cada uso del dispositivo.
- **Constructor:**
  - Debe inicializar ambos atributos.
- **Métodos**:
  - **usarDispositivo()**: Este método imprime "El dispositivo X ha sido utilizado.", donde X es el nombre del dispositivo.
  - **getNombre()**: Devuelve el nombre del dispositivo.
---
### 2. Define la clase DispositivoConBateria que herede de Dispositivo, con estos requisitos adicionales:
- **Atributo extra:** bateria(tipo int), que representa la cantidad de batería disponible (100 por defecto).
- **Métodos:**
  - **Sobreescribir** usarDispositivo():
    - Si la batería es mayor que 0, imprime "El dispositivo X ha sido utilizado. Batería restante: Y%",donde X es el nombre e Y es la batería restante.
    - Reduce la batería según consumoPorUso.
    - Si la batería llega a 0, imprime "El dispositivo X se ha quedado sin batería."
  - **Método** recargar(): Reestablece la batería al 100%.
---
### 3. En main(), se encuentra lo siguiente:
- Crear una instancia de DispositivoConBateria con un consumo por uso de 20.
- Usarlo varias veces hasta que se quede sin batería.
- Recargarlo y probar que vuelve a funcionar.
---
## EXTRA
Implementación de lo siguiente:
- **Una clase Portatil** que tenga un **modo de ahorro de energía** que reduzca el consumo de batería a la mitad.
- **Un método** modoUltraAhorro() en DispositivoConBateria que reduzca el consumo a la mitad y aumente la autonomía.