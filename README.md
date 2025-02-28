# Gesti-n-de-Reportes-

# 📊 Generador de Reportes - Abstract Factory

Bienvenido al **Generador de Reportes**, un proyecto basado en el **Patrón Abstract Factory** que permite la generación y descarga de reportes en múltiples formatos: **PDF, Excel y CSV**. 📄📊📁

## 🚀 Características
- Generación de reportes en diferentes formatos.
- Implementación del patrón **Abstract Factory** para flexibilidad y escalabilidad.
- Diseño modular que permite la fácil extensión para nuevos formatos de reporte.

## 🏗️ Arquitectura
El proyecto sigue una estructura basada en fábricas:
- **`Report` (Interfaz)** → Define métodos `generateReport()` y `downloadReport()`.
- **Implementaciones concretas** → `PDFReport`, `ExcelReport`, `CSVReport`.
- **Fábricas concretas** → `PDFReportFactory`, `ExcelReportFactory`, `CSVReportFactory`.
- **Cliente** → Selecciona el tipo de reporte y obtiene la fábrica correspondiente.

## 🛠️ Instalación y Uso
1. **Clona el repositorio**
   ```sh
   git clone https://github.com/tuusuario/tu-repo.git
   cd tu-repo
   ```
2. **Compila y ejecuta el programa**
   ```sh
   javac ReportClient.java
   java ReportClient
   ```
3. **Selecciona el tipo de reporte modificando la llamada en `ReportClient`**
   ```java
   ReportFactory factory = getReportFactory("PDF"); // Cambia "PDF" por "EXCEL" o "CSV"
   ```

## 📜 Ejemplo de Uso
```java
ReportFactory factory = getReportFactory("CSV");
Report report = factory.createReport();
report.generateReport();
report.downloadReport();
```
Salida esperada:
```
Generando reporte en CSV...
Descargando reporte en CSV...
```

## 📌 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas agregar nuevos formatos de reporte o mejorar el código, siéntete libre de hacer un **fork** y enviar un **pull request**. 🚀

## 📝 Licencia
Este proyecto está bajo la licencia **MIT**. Puedes usarlo libremente para proyectos personales o comerciales.

---
📌 *Hecho con ❤️ y Java*

