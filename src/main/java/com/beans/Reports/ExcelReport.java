package com.beans.Reports;

public class ExcelReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en Excel...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en Excel...");
    }
}
