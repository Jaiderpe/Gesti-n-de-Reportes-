package com.beans.Cliente;

import com.beans.factories.ExcelReportFactory;
import com.beans.factories.PDFReportFactory;
import com.beans.factories.ReportFactory;

import java.util.Scanner;

import com.beans.Reports.Report;
import com.beans.factories.CSVReportFactory;

public class ReportClient {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que elija el formato del reporte
        System.out.println("Seleccione el formato del reporte (PDF, EXCEL, CSV): ");
        String type = scanner.nextLine().trim().toUpperCase();
        
        try {
            ReportFactory factory = getReportFactory(type);
            Report report = factory.createReport();
            report.generateReport();
            report.downloadReport();
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        scanner.close();
    }


    public static ReportFactory getReportFactory(String type) {
        switch (type.toUpperCase()) {
            case "PDF": return new PDFReportFactory();
            case "EXCEL": return new ExcelReportFactory();
            case "CSV": return new CSVReportFactory();
            default: throw new IllegalArgumentException("Formato de reporte no soportado");
        }
    }
}