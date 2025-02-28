package com.beans.factories;
import com.beans.Reports.Report;
import com.beans.Reports.ExcelReport;

public class ExcelReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new ExcelReport();
    }
}