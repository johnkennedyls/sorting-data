# Sorting Data

A Spring Boot application that demonstrates the implementation of the **Quick Sort algorithm** for ordering randomly generated numbers.

The project was developed as a practical exercise to understand sorting algorithms, backend architecture, and the separation of responsibilities in a Spring Boot application.

## Technologies

* **Java 17**
* **Spring Boot**
* **Spring MVC**
* **Thymeleaf**
* **Lombok**
* **Maven**

The project uses Spring Boot and Maven, with Java 17 configured as the target version.

## Features

* Generate and process random numbers.
* Sort data using the **Quick Sort** algorithm.
* Separate application logic into controller, model, and service layers.
* Present results through a web interface using Thymeleaf.

## Project Structure

```text
sorting-data/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── fup/
│   │   │           └── sorting_data/
│   │   │               ├── controller/
│   │   │               │   └── SortingController.java
│   │   │               ├── model/
│   │   │               │   ├── SortingRequest.java
│   │   │               │   └── SortingResult.java
│   │   │               ├── service/
│   │   │               │   └── SortingService.java
│   │   │               └── SortingDataApplication.java
│   │   └── resources/
│   │
│   └── test/
│
├── .gitignore
├── .gitattributes
├── mvnw
├── mvnw.cmd
└── pom.xml
```

The current repository follows this controller/model/service organization.

## How Quick Sort Works

Quick Sort is a divide-and-conquer sorting algorithm.

Its general process is:

1. Select a **pivot** element.
2. Partition the collection around the pivot.
3. Elements smaller than the pivot are placed on one side.
4. Elements greater than the pivot are placed on the other side.
5. Recursively apply the same process to both partitions.

### Complexity

| Case    | Time Complexity |
| ------- | --------------: |
| Best    |    `O(n log n)` |
| Average |    `O(n log n)` |
| Worst   |         `O(n²)` |

The worst case can occur when the pivot selection produces highly unbalanced partitions.

## Getting Started

### Prerequisites

Make sure you have installed:

* Java 17 or higher
* Maven, or use the included Maven Wrapper

Verify Java:

```bash
java -version
```

### Clone the Repository

```bash
git clone https://github.com/johnkennedyls/sorting-data.git
cd sorting-data
```

### Run the Application

Using Maven Wrapper on Windows:

```bash
mvnw.cmd spring-boot:run
```

On Linux/macOS:

```bash
./mvnw spring-boot:run
```

Alternatively, if Maven is installed:

```bash
mvn spring-boot:run
```

### Build the Project

```bash
./mvnw clean package
```

On Windows:

```bash
mvnw.cmd clean package
```

## Architecture

The application follows a simple layered architecture:

```text
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Sorting Algorithm
   │
   ▼
Model / Result
```

### Controller

`SortingController` handles incoming web requests and coordinates the interaction between the web layer and the sorting service.

### Service

`SortingService` contains the core sorting logic and is responsible for processing the data.

### Model

The application uses:

* `SortingRequest` for incoming sorting data.
* `SortingResult` for representing the sorting result.

This separation keeps the sorting logic independent from the presentation layer.

## Purpose

This project is intended for educational purposes and focuses on:

* Understanding sorting algorithms.
* Implementing Quick Sort.
* Practicing Java and Spring Boot.
* Applying layered application architecture.
* Understanding the interaction between controllers, services, models, and web views.

## Author

**John Kennedy**

Systems Engineering Student and Software Developer.

GitHub: [@johnkennedyls](https://github.com/johnkennedyls)

## License

This project is available for educational and personal use.
