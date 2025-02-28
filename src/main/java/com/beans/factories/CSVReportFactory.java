package com.beans.factories;
import com.beans.Reports.Report;
import com.beans.Reports.CSVReport;



public class CSVReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new CSVReport();
    }
}