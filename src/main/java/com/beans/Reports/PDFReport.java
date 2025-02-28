package com.beans.Reports;


public class PDFReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Generando reporte en PDF...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Descargando reporte en PDF...");
    }
}