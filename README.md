# UNIVERSIDAD DE SAN CARLOS DE GUATEMALA
## FACULTAD DE INGENIERIA
### ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 1

#### CLASE 1

## COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS BAT
- Dirigirse a la carpeta src/Generadores
- Hacer doble click sobre los archivos Lexico.bat y Sintactico.bat

## COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS .java, DESDE NETBEANS
- Desde Netbeans, dirigirse a la carpeta Generadores
- Hacer click derecho sobre los archivos GLexico.java o GSintactico.java
- Seleccionar Run File

## COMPILAR FLEX Y CUP A TRAVÉS DE CONSOLA
- Descomprimir en C:\Clase1
- Abrir esta ruta en consola C:\Clase1\src\Analizadores
- Ejecutar los siguientes comandos 
	1. Generar Léxico
		```
		java -jar "C:\Clase1\lib\jflex-1.7.0\lib\jflex-full-1.7.0.jar" a_lexico.jflex
		```
	2. Generar Sintáctico
		```
		java -jar "C:\Clase1\lib\java-cup-11b.jar" -parser a_sintactico -symbols Simbolos a_sintactico.cup
		```