#UNIVERSIDAD DE SAN CARLOS DE GUATEMALA
##FACULTAD DE INGENIERIA
###ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 1

####CLASE 1

##COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS BAT
1. Dirigirse a la carpeta src/Generadores
2. Hacer doble click sobre los archivos Lexico.bat y Sintactico.bat

##COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS .java, DESDE NETBEANS
1. Desde Netbeans, dirigirse a la carpeta Generadores
2. Hacer click derecho sobre los archivos GLexico.java o GSintactico.java
3. Seleccionar Run File

##COMPILAR FLEX Y CUP A TRAVÉS DE CONSOLA
1. Descomprimir en C:\Clase1
2. Abrir esta ruta en consola C:\Clase1\src\Analizadores
3. Ejecutar los siguientes comandos 
	3.1 Generar Léxico
		java -jar "C:\Clase1\lib\jflex-1.7.0\lib\jflex-full-1.7.0.jar" a_lexico.jflex
	4.1 Generar Sintáctico
		java -jar "C:\Clase1\lib\java-cup-11b.jar" -parser a_sintactico -symbols Simbolos a_sintactico.cup