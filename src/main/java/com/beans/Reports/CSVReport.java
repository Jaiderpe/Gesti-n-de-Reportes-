package com.beans.Reports;

public class CSVReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en CSV...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en CSV...");
    }
}