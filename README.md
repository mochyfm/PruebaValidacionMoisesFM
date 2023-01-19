## PROBLEMA 1 ##

La media aritmética se define como la suma de todas las notas entre el número total de las mismas.

**Requisitos funcionales:**
- Los hilos deben extender de la clase Thread
- El número total de calificaciones será de 100.000
- El número total de hilos que se emplearán es de 10
- Cada hilo debe tener una capacidad de procesar/sumar 10.000 calificaciones
- Cada hilo debe tener un identificador numérico
- Cuando TODOS los hilos hayan acabado de sumar las calificaciones asignadas a cada uno, debe mostrarse por consola el primer mensaje “Todos los hilos han acabado su tarea”.
- A continuación, se mostrará un mensaje por cada hilo que indique:

<p align="center">
    <i>El hilo ‘N’, que empezó en el índice ‘i’ y ha contado ‘X’ calificaciones, ha sumado un total de: ‘R’</i>
</p>

**Donde:**

- ‘N’ es el identificador del hilo. 
- ‘i’ el índice del array desde el que empezó a contar ese hilo.
- ‘X’ el total de calificaciones que ha sumado.
- ‘R’ el resultado final de la suma.

Por último, deberá calcularse la media sumando el resultado total de cada hilo entre el número total de calificaciones y mostrarse por consola el mesaje:

<p align="center">
    <i>La media aritmética es de ‘M’</i>
</p>

**Donde:** ‘M’ es el resultado final.

<hr/>

## PROBLEMA 2

**Requisitos funcionales:** 

- Los comensales deben implementar la interfaz Runnable. 
- El número total de comensales es 3.
- Cada comensal tendrá un nombre que servirá de identificador.
- Cada comensal debe tener una prioridad distinta, 1, 5 y 10.
- Debe haber un recurso compartido (mesa) que tenga un total de 15 magdalenas.
- Cuando un comensal coge una magdalena, los demás no pueden.
- Todos los comensales tardan 10 segundos en comerse una magdalena.
- Cada vez que un comensal coge una magdalena debe indicarse por pantalla con un mensaje :

<p align="center">
    <i>‘Fulanito’ ha cogido una magdalena de la mesa</i>
</p>

Cada vez que un comensal ha terminado de comerse una magdalena debe indicarse por pantalla con un mensaje:

<p align="center">
    <i>‘Fulanito’ se ha terminado de comer una magdalena</i>
</p>


<br/>

Fuente de elementos usados en la consola: [link](https://docs.google.com/document/d/1cZ-opOjGhA2qwMc_Ck_wj-BZ-7eqk3NH52NtuCn_F1o)