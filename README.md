# Conversor de Moneda en Java

Este proyecto en Java implementa un simple conversor de moneda que permite al usuario seleccionar diferentes opciones de conversión entre distintas monedas y realizar conversiones basadas en una tasa ficticia.

## Funcionalidades

- **Conversión entre monedas:** Permite al usuario seleccionar entre varias opciones de conversión, como USD a Peso Argentino, Peso Argentino a USD, etc.
  
- **Interacción intuitiva:** Utiliza un menú interactivo para mostrar las opciones disponibles y guiar al usuario durante la ejecución del programa.

## Estructura del proyecto

El proyecto está estructurado en las siguientes clases principales:

- **ConversorMonedaApp.java:** Punto de entrada principal que inicializa y ejecuta la aplicación del conversor de moneda.
  
- **ConversorMoneda.java:** Clase que gestiona la interacción con el usuario a través del menú y la lógica principal del conversor.
  
- **Menu.java:** Clase que maneja la presentación del menú y la lectura de la entrada del usuario.
  
- **GestorConversion.java:** Clase que gestiona la lógica de conversión de moneda, utilizando una simulación de consulta a una API externa para obtener las tasas de conversión.
  
- **ConsultarAPI.java:** Clase ficticia que simula la consulta a una API externa para obtener las tasas de conversión de moneda.
  
- **Moneda.java:** Clase que modela una moneda y su resultado de conversión.

## Uso

1. **Compilación:** Para compilar el proyecto, asegúrate de tener configurado un entorno de desarrollo Java (JDK) y ejecuta el siguiente comando en la terminal:

   ```bash
   javac *.java
   
2. **Ejecucion:** Una vez compilado, ejecuta el programa con el siguiente comando:
   ```bash
   java Principal.ConversorMonedaApp
   
3. **Interaccion** Sigue las instrucciones en pantalla para seleccionar las opciones de conversión e ingresar la cantidad a convertir.

## Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún problema o tienes sugerencias para mejorar el código, no dudes en crear un issue o enviar un pull request.

## Autor
Este proyecto fue desarrollado por Franco Rosales.
