# Sorting Data: Quicksort vs Merge Sort

Aplicación web construida con Java y Spring Boot bajo el patrón arquitectónico Modelo-Vista-Controlador (MVC), capaz de generar una cantidad indeterminada de datos aleatorios, ordenarlos mediante el algoritmo Quicksort y ejecutar un benchmark comparativo contra Merge Sort aplicando el método del límite dentro de la notación Big O.

**Autores:** John Kennedy, Nicolas Sandoval
**Paquete base:** `com.fup.sorting_data`

## Características

### Módulo Quicksort
- Generación de N datos aleatorios solicitados por el usuario.
- Ordenamiento mediante Quicksort con selección de pivote central.
- Visualización de los datos antes y después de la ordenación.
- Protección del renderizado: las tablas detalladas se muestran únicamente para N menor o igual a 200; el tamaño máximo aceptado es 1.000.000.

### Módulo Benchmark Comparativo
- Evaluación de ambos algoritmos sobre los mismos conjuntos de datos aleatorios.
- Tamaños evaluados: N = 1.000, 10.000, 100.000, 1.000.000 y 10.000.000.
- Medición de tiempos con `System.nanoTime()` y fase de warmup previa para mitigar el efecto del compilador JIT.
- Cálculo de las divisiones F(n)/G(n) y G(n)/F(n), donde F(n) es el tiempo de Quicksort y G(n) el tiempo de Merge Sort.
- Estimación experimental del límite lim (n → ∞) F(n)/G(n) e interpretación asintótica automática.

## Tecnologías

- Java 17
- Spring Boot 3.2.x
- Spring Web (servidor embebido Tomcat)
- Thymeleaf (motor de plantillas del lado del servidor)
- Maven

## Requisitos

- JDK 17 o superior
- Maven 3.6 o superior
- Navegador web moderno

## Estructura del Proyecto

```text
sorting_data/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── fup/
        │           └── sorting_data/
        │               ├── SortingDataApplication.java
        │               ├── controller/
        │               │   ├── BenchmarkController.java
        │               │   └── SortingController.java
        │               ├── model/
        │               │   ├── BenchmarkResult.java
        │               │   ├── BenchmarkRow.java
        │               │   ├── SortingRequest.java
        │               │   └── SortingResult.java
        │               └── service/
        │                   ├── BenchmarkService.java
        │                   └── SortingService.java
        └── resources/
            ├── application.properties
            └── templates/
                ├── benchmark.html
                └── index.html
