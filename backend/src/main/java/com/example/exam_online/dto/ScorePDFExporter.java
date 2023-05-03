package com.example.exam_online.dto;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class ScorePDFExporter {
    private List<ScoreBoard> scoreBoardList;

    public ScorePDFExporter(java.util.List<ScoreBoard> scoreBoardList) {
        this.scoreBoardList = scoreBoardList;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(4);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("User ID", font));

        table.addCell(cell);

        cell.setPhrase(new Phrase("Username", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Score", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Exam", font));
        table.addCell(cell);
    }

    private void writeTableData(PdfPTable table) {
        for (ScoreBoard scoreBoard : scoreBoardList) {
            table.addCell(String.valueOf(scoreBoard.getIdUser()));
            table.addCell(scoreBoard.getUsername());
            table.addCell(String.valueOf(scoreBoard.getScore()));
            table.addCell(scoreBoard.getExam());
        }
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        com.lowagie.text.Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("Score", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {3.5f, 3.5f, 3.0f, 3.0f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }
}
