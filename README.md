# Actividades de Java — capítulos 1 al 38

Soluciones de las actividades propuestas hasta el capítulo 38 del video
[Curso completo de Java desde cero para principiantes](https://www.youtube.com/watch?v=JOAqpdM36wI),
de MoureDev.

## Alcance de la entrega

La entrega contiene exactamente los cinco bloques de ejercicios que aparecen antes o en el capítulo 38:

| Capítulo | Tema | Archivo | Actividades |
|---:|---|---|---:|
| 14 | Primeros pasos | `basic/c00_helloworld/HelloWorldExercises.java` | 10 |
| 17 | Variables y constantes | `basic/c01_beginner/BeginnerExercises.java` | 10 |
| 23 | Operadores | `basic/c02_operators/OperatorsExercises.java` | 10 |
| 34 | Strings | `basic/c03_strings/StringsExercises.java` | 10 |
| 38 | Condicionales | `basic/c04_conditionals/ConditionalsExercises.java` | 10 |

Total: **50 actividades resueltas**. No se incluyen contenidos posteriores al capítulo 38.

## Requisitos

- JDK 21 o superior, tal como se indica en el material del curso.

## Compilación

Desde la raíz del repositorio:

```bash
javac -d out basic/c00_helloworld/HelloWorldExercises.java \
  basic/c01_beginner/BeginnerExercises.java \
  basic/c02_operators/OperatorsExercises.java \
  basic/c03_strings/StringsExercises.java \
  basic/c04_conditionals/ConditionalsExercises.java
```

Ejemplo de ejecución:

```bash
java -cp out basic.c04_conditionals.ConditionalsExercises
```

Los ejercicios 9 y 10 del primer bloque piden provocar errores de ejecución o compilación. Para conservar una entrega que compile correctamente, el resultado de ambas pruebas está explicado dentro del archivo correspondiente.

## Referencias

- [Video del curso](https://www.youtube.com/watch?v=JOAqpdM36wI)
- [Repositorio oficial con los enunciados](https://github.com/mouredev/hello-java)
