# **UNIVERSIDAD DE SAN CARLOS DE GUATEMALA**
## *ORGANIZACIÓN DE LENGUAJES Y COMPILADORES 1*

#### **CLASE 1**

### _COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS BAT_
- Dirigirse a la carpeta src/Generadores
- Hacer doble click sobre los archivos Lexico.bat y Sintactico.bat

### _COMPILAR FLEX Y CUP A TRAVÉS DE ARCHIVOS .java, DESDE NETBEANS_
- Desde Netbeans, dirigirse a la carpeta Generadores
- Hacer click derecho sobre los archivos GLexico.java o GSintactico.java
- Seleccionar Run File

### _COMPILAR FLEX Y CUP A TRAVÉS DE CONSOLA_
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

### _ENTRADAS ADMITIDAS_
#### **Operaciones aritméticas**
- Ejemplo:
		```
		4+3*5/10;
		```

#### **Lista de Ids**
- Ejemplo:
		```
		id1, id2, id_3;
		```

#### **Listas y Operaciones juntas**
- Ejemplo:
		```
		id1, id2 ;
		3 + 3;
		```

