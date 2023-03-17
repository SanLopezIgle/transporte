## Patron Factory
Este proyecto consiste en indicar cuál es el coste total de un envío y el tipo de embalaje empleado, según el tipo de transporte utilizado.

- ### Interfaz ITransporte
Definimos en la interfaz los métodos que van a implementar las clases en las que definamos un tipo de transporte. En nuestro caso: Camion, Bici y Barco
- ### Clase FactoryTransporte
Definimos constantes literales, nos devuelve un objeto estático de tipo ITransporte (lo usamos para pedir el tipo de transporte que queramos)
- ### Clase Bici
Implementamos los métodos de la interfaz ITransporte
- ### Clase Barco
Implementamos los métodos de la interfaz ITransporte
- ### Clase Camion
Implementamos los métodos de la interfaz ITransporte
- ### Main
Ejemplo:

ITransporte transporte = FactoryTransporte.getTransporte(FactoryTransporte.CAMION);

FactoryTransporte.CAMION: nos devuelve un objeto ITransporte