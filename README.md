# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## 1️⃣ Identificación de Tareas Repetitivas

Responder:

## ¿Qué partes del código pueden convertirse en métodos?
  las opciones del menu agregar, mostrar, promedio y nota mas alta de los  estudiantes tambien se pueden connvertir en metodo algunas validaciones
  como la validacion de enteros, doubles

## ¿Qué bloques de código se repiten
  se repiten las validaciones si las listas de estudiantes y calificaciones estan vacias y el recorrido de las mismas listas con for

## ¿Qué responsabilidades pueden separarse?
  el menu que sea el unico que se encuentre en el main 
  ingreso a estudiantes
  mostrar estudiantes
  mostrar promedio de calificaciones
  mostrar al estudiante con la mejor nota
  las validaciones

Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

## Explicar por qué dividir estas tareas mejora el programa.
hace un programa mas limpio, organizado y nos da una mejor manera de poder manipularlo para cambiarlo si es necesario 


## 2️⃣ Variables Locales vs Globales

Responder:

## ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
  la variable scanner ya que al empezar la modularizacion todos los metodos la tendran que usar
  
## ¿Cuáles deberían ser locales dentro de un método?
- int opcion
- String nombre
- double calificacion
- double suma
- double promedio
- double maxCalificacion
- String estudianteMax
  
## ¿Por qué?
por qué solo se usan para una operacion especifica dentro de un metodo y no representan el estado permanente del sistema 

## Reflexionar sobre:

- Alcance (scope)
- Tiempo de vida de la variable
- Riesgos de modificar datos globales accidentalmente


# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir: 
Ingresar datos donde van números y viceversa o en el caso de las calificaciones agregar un numero mayor a 100 si no hay validación.

- Qué validaciones implementaron.
1. En el ingreso de calificaciones la validación que se agrego fue que el numero ingresado debia estar entre 0 y 100 para calcular un promedio correcto.

2. Para el ingreso de los nombres la validación que se agrego es que solo se ingresen letras y caracteres especiales como tildes y la letra ñ

- Por qué son importantes.
Para que el usuario ingrese lo que se solicita y que no interfiera con el funcionamiento del programa pues los métodos están esperando un tipo de dato especifico para ejecutarse y si no se ingresan datos correctos es un error.

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?
Al dividir el programa en métodos hace que este mas ordenado y cada uno de los métodos hace algo en especifico permitiendo cambiar las condiciones del método si es necesario. de la misma forma una vez creado el método se puede llamar desde un método distinto evitando que el código sea repetitivo.


## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?
uno de los mayores inconvenientes es que ocupa demasiado espacio en la memoria y puede generar errores al intentar definir una variable en otra parte del programa con el mismo nombre puede que ya tenga un valor y mandara un resultado inexacto.

No se pueden reutilizar fácilmente pues tienen un valor definido y si en otro programa se necesita otro valor es necesario cambiarlo y esto a la vez nos provocara errores en otras partes del programa.


## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?
Al tener el programa dividido en métodos otros colaboradores pueden identificar fácilmente para que funciona cada método y realizar cambios si es necesario.

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos** |
