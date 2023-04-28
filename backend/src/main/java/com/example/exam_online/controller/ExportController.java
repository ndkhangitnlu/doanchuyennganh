package com.example.exam_online.controller;

import com.example.exam_online.dto.ScoreBoard;
import com.example.exam_online.dto.ScorePDFExporter;
import com.lowagie.text.DocumentException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExportController {
    @GetMapping("/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=score_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
//
        List<ScoreBoard> list = new ArrayList<>();
        list.add(new ScoreBoard("user1",15,20,9));
        list.add(new ScoreBoard("user2",16,20,9.25));
        list.add(new ScoreBoard("user3",17,20,9.5));
        list.add(new ScoreBoard("user4",18,20,9.75));
        list.add(new ScoreBoard("user5",19,20,9.9));

        ScorePDFExporter exporter = new ScorePDFExporter(list);
        exporter.export(response);

    }
}
