
Por: Samuel Botero Rivera
    Juan Jose Zapata Moreno
    Marisol Rodas Osorio

link del APK: app link: https://drive.google.com/file/d/1P7ll4Y7fUpiqX8Zz4ZYao03gmffNTbl7/view?usp=drive_link
Link del la visualización de datos: https://docs.google.com/spreadsheets/d/1oNZiEpBWYAzLmBGuj7YLRjzRepV8UllERnq1MSIhQlA/edit?usp=sharing

Una aplicación de Android que realiza reconocimiento facial en tiempo real utilizando embeddings de FaceNet y una base de datos en Firestore.


## Tabla de Contenidos
1. [Descripción Detallada del Proyecto](#descripción-detallada-del-proyecto)
2. [Características Principales](#características-principales)
3. [Tecnologías y Herramientas](#tecnologías-y-herramientas)
4. [Arquitectura del Software](#arquitectura-del-software)
5. [Guía de Instalación y Ejecución](#guía-de-instalación-y-ejecución)
6. [Funcionamiento Técnico](#funcionamiento-técnico)
7. [Agradecimientos](#agradecimientos)

## Descripción Detallada del Proyecto
Este proyecto es una aplicación de Android diseñada para el reconocimiento facial en tiempo real. La aplicación permite a los usuarios registrarse capturando imágenes de su rostro, que se procesan para generar embeddings faciales mediante el modelo FaceNet. Estos embeddings se almacenan en Firestore, una base de datos NoSQL en la nube, que también funciona como una base de datos vectorial para realizar búsquedas de similitud.

El objetivo principal de este proyecto es demostrar la viabilidad de un sistema de reconocimiento facial robusto y eficiente en un entorno móvil, utilizando herramientas modernas de desarrollo de Android y técnicas de aprendizaje automático.

## Características Principales
- **Reconocimiento facial en tiempo real:** Identifica rostros conocidos en la transmisión de la cámara en vivo.
- **Registro de usuarios:** Permite a los nuevos usuarios registrar sus rostros en el sistema.
- **Detección de suplantación de identidad:** Implementa un mecanismo para detectar si el rostro es real o una suplantación (ej. una foto).
- **Base de datos en la nube:** Utiliza Firestore para almacenar y gestionar los embeddings faciales.

## Tecnologías y Herramientas
- **Lenguaje de Programación:** Kotlin
- **Interfaz de Usuario:** Jetpack Compose
- **Machine Learning:** TensorFlow Lite, FaceNet
- **Base de Datos:** Firestore
- **Arquitectura:** MVVM (Model-View-ViewModel)

## Arquitectura del Software
La aplicación sigue la arquitectura MVVM, que separa la lógica de la interfaz de usuario de la lógica de negocio. Esto facilita el mantenimiento y la escalabilidad del código.

- **Capa de Datos:** Se encarga de la comunicación con Firestore para almacenar y recuperar los embeddings faciales.
- **Capa de Dominio:** Contiene la lógica de negocio, incluyendo el procesamiento de imágenes, la generación de embeddings con FaceNet y la comparación de vectores.
- **Capa de Presentación:** Construida con Jetpack Compose, esta capa se encarga de mostrar la interfaz de usuario y de interactuar con el usuario.

## Guía de Instalación y Ejecución
1.  **Clonar el repositorio:**
    ```bash
    git clone <URL_DEL_REPOSITORIO>
    ```
2.  **Abrir en Android Studio:**
    Abre el proyecto en Android Studio.
3.  **Sincronizar Gradle:**
    Espera a que Gradle sincronice todas las dependencias del proyecto.
4.  **Ejecutar la aplicación:**
    Ejecuta la aplicación en un emulador o en un dispositivo físico.

## Funcionamiento Técnico
El flujo de reconocimiento facial se puede resumir en los siguientes pasos:
1.  **Captura de imagen:** La cámara del dispositivo captura un fotograma.
2.  **Detección de rostros:** Se utiliza un detector de rostros para identificar y recortar cualquier rostro presente en la imagen.
3.  **Generación de embeddings:** El rostro recortado se pasa al modelo FaceNet, que genera un embedding (un vector de características) que representa el rostro.
4.  **Búsqueda en Firestore:** El embedding generado se compara con los embeddings almacenados en Firestore para encontrar el rostro más similar.
5.  **Identificación:** Si se encuentra un rostro con una similitud superior a un umbral predefinido, se identifica a la persona.

## Agradecimientos
Este proyecto se inspiró en el repositorio [OnDevice-Face-Recognition-Android](https://github.com/shubham0204/OnDevice-Face-Recognition-Android) de Shubham Mor. Se han realizado modificaciones significativas en el modelo y en la arquitectura de datos para adaptarlo a los requisitos de este proyecto.
