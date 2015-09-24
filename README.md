## A modo de propuestas para este primer tinglado en Java

Partiendo de que el objetivo es refrescar los conocimientos de Java, o incluso avanzar hacia técnicas o trucos nuevos este puede ser un buen punto en el que enumerar propuestas de programación.
Otras sugerencias y formatos podemos adoptarlos en cualquier momento si hay consenso, pero por ahora, y a falta de una idea mejor, se me ha ocurrido que para que nos familiaricemos con GitHub y su modelo de programación concurrente u orientado a equipos, empecemos cada cual aportando una clase .java que no dependa de otras clases o funciones de este mismo proyecto (a ser posible en este primer intento que sólo dependa de la bilbioteca estándar del JDK 1.8) y cuya entrada/salida se haga sólo a través de System.
La función main() de la clase principal, en este caso Primero.java, debería limitarse a instanciar cada clase de este modo:
```java
NombreDeLaClase variable=new NombreDeLaClase();
```
Sin argumentos ni referencias a objetos o variables externas a la clase.
La idea es escribir cada cual su propia clase, probarla, "pullearla" cada cual hacia la rama secundaria (pública) de su propio fork y notificarme la intención de añadirla al proyecto principal. Yo me limitaré a modificar la función main() y a incorporar la nueva clase (o grupo de ficheros) y a notificar al grupo los cambios para que cada cual pueda sincronizar su rama master.
Si con el tiempo vemos que no tenemos problemas con el proceso GitHub podemos automatizar aún más las cosas con el objetivo de hacer mi papel menos relevante o necesario. 

### Lo propiamente Java
Se podría poner aquí las propuestas de código que cada cual va escribir
El sentido de cada clase podría ser más didáctico que motivado por las ganas de impresionar a los colegas. Para éso si hay tiempo y ganas, crearemos otro proyecto más adelante.
En este primer ejercicio intentemos reducir la entrada/salida todo lo posible. Lo interesante es poder ver el códgo. Quien quiera probar lo que encuentre en cada fichero, que lo copie a proyecto personal aparte y lo pruebe ahí. Este proyecto se llama Primero. En el que llamemos Segundo podríamos proponer algún tipo de interactividad básica común (un menú y que luego cada clase se ocupe de volver a él, o algo similar)
Dando por supuesto que al menos se entiende el modo en que estamos usando main(), seguimos uno de tantos esquemas clásicos de introducción a un lenguaje. 
* Sintaxis básicas y estructuras de control
* Clases, objetos, this, constructor, tipos enumerados, etc.
* OOP un poco más avanzada: clases anidadas, ámbitos (scope) y control de accesso, etc.
* OOP más avanzada: herencia, interfaces, anotaciones, generics, etc.
* Haciendo cosas con números, cadenas, fechas y otros tipos
* Acceso a disco: información sobre ficheros, directorios
* Operaciones sobre ficheros de texto y binarios
* Expresiones regulares
* XML
* Acceso a datos remotos

#### Otra posibilidad
Realmente cualquier tema que se quiera atacar en un lenguaje tan profusamente documentado y utilizado como java permite verlo de cien maneras distintas.
Otra opción que podríamos estudiar es la de crear proyectos en torno a un tema determinado, por ejemplo los "generics" o abstracción de clases, o yo qué sé, algoritmos básicos, y que cada miembro del grupo lo explore a su modo. Entonces cada proyecto lo llamaríamos por ejemplo CMDAM2Ordenacion y cada cual que añada su historia en forma de uno o varios ficheros con algún esquema de nombres acordado. 
No olvidemos que esto es un sistema bastante abierto y que cada grupo, según sus propias características, irá
amoldando la herramienta a sus necesidades.

