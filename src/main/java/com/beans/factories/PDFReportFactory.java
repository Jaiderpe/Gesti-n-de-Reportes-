package com.beans.factories;
import com.beans.Reports.Report;
import com.beans.Reports.PDFReport;

public class PDFReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}