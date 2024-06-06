Explicación del Programa

Este programa gestiona la información de aeropuertos, vuelos y compañías, y permite mostrar los vuelos de salida y llegada de cada aeropuerto. El programa está organizado en varias clases y un método principal (main).

1. Clases del Programa

1.1 Clase Aeropuerto
La clase Aeropuerto define un aeropuerto con los siguientes atributos:
- código: Código único del aeropuerto.
- nombre: Nombre completo del aeropuerto.
- población: Ciudad donde se encuentra el aeropuerto.
- país: País donde se encuentra el aeropuerto.
- gmt: Zona horaria en relación a UTC.

1.2 Clase Compania
La clase Compania define una compañía aérea con un solo atributo:
- nombre: Nombre de la compañía.

1.3 Clase Vuelo
La clase Vuelo define un vuelo con los siguientes atributos:
- tipoVuelo: Tipo de vuelo (Regular o Charter).
- origen: Código del aeropuerto de origen.
- destino: Código del aeropuerto de destino.
- duracion: Duración del vuelo.
- aerolinea: Compañía aérea que opera el vuelo.
- tipoAvion: Tipo de avión utilizado.
- plazas: Capacidad de pasajeros.

Esta clase tiene dos subclases:
- VueloRegular: Para vuelos regulares con los atributos adicionales 'horarioVuelo' e 'informacionAdicional'.
- VueloCharter: Para vuelos charter con los atributos adicionales 'nombrePaquete' y 'fechaHora'.

2. Creación de Objetos

2.1 Creación de Aeropuertos
Se crean objetos de la clase Aeropuerto para representar varios aeropuertos:
- Aeropuerto "BCN01" en Barcelona, España.
- Aeropuerto "MAD01" en Madrid, España.
- Aeropuerto "PAR01" en París, Francia.
- Aeropuerto "LON01" en Londres, Gran Bretaña.
- Aeropuerto "SPA01" en Sao Paulo, Brasil.

2.2 Creación de Compañías
Se crean objetos de la clase Compania para representar varias compañías aéreas:
- Compañía "Iberia".
- Compañía "British Air".
- Compañía "Ryan Air".
- Compañía "Spanair".

2.3 Creación de Vuelos
Se crean objetos de las clases VueloRegular y VueloCharter para representar varios vuelos. Cada vuelo tiene atributos específicos que describen su tipo de vuelo, origen, destino, duración, aerolínea, tipo de avión, plazas y otros detalles relevantes.

3. Funcionalidad Principal

3.1 Mostrar Vuelos de Salida
Para cada aeropuerto, el programa muestra la lista de vuelos que salen de dicho aeropuerto. Si no se encuentran vuelos de salida, se imprime un mensaje indicando que no hay vuelos de salida desde ese aeropuerto.

3.2 Mostrar Vuelos de Llegada
Para cada aeropuerto, el programa muestra la lista de vuelos que llegan a dicho aeropuerto. Si no se encuentran vuelos de llegada, se imprime un mensaje indicando que no hay vuelos de llegada a ese aeropuerto.