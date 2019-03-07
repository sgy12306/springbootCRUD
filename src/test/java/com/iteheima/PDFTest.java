package com.iteheima;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javafx.scene.control.Cell;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFTest {
    public static void main(String[] args) throws Exception {
        //设置纸张大小
        Document document = new Document(PageSize.A3,50,50,50,50);
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\cold\\Desktop\\temp.pdf"));
        //打开文档
        document.addTitle("pdf生成策略");
        document.open();
        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
     Font Chinese = new Font(bfChinese, 12, Font.NORMAL);
        //添加一个内容段落

        //添加标题

        Rectangle rectangle = new Rectangle(PageSize.A3);
        //设置成横向
        rectangle.rotate();
        //添加段落
        Anchor anchorTarget = new Anchor("First page of the document.");
        anchorTarget.setName("BackToTop");
        Paragraph paragraph1 = new Paragraph();

        paragraph1.setSpacingBefore(50);

        paragraph1.add(anchorTarget);
        document.add(paragraph1);

        document.add(new Paragraph("Some more text on the first page with different color and font type.",
                FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));
        //添加一个章
        Paragraph title1 = new Paragraph("Chapter 1",

                FontFactory.getFont(FontFactory.HELVETICA,

                        18, Font.BOLDITALIC, new CMYKColor(0, 255, 255,17)));

        Chapter chapter1 = new Chapter(title1, 1);

        chapter1.setNumberDepth(0);

        Paragraph title11 = new Paragraph("This is Section 1 in Chapter 1",

                FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,

                        new CMYKColor(0, 255, 255,17)));

        Section section1 = chapter1.addSection(title11);

        Paragraph someSectionText = new Paragraph("This text comes as part of section 1 of chapter 1.");

        section1.add(someSectionText);

        someSectionText = new Paragraph("Following is a 3 X 2 table.");

        section1.add(someSectionText);



//        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
//        Font font = new Font(bfChinese);
//        font.setColor(BaseColor.BLUE);
        //添加表格
        PdfPTable t = new PdfPTable(3);

        t.setSpacingBefore(25);

        t.setSpacingAfter(25);


        PdfPCell c1 = new PdfPCell(new Phrase("逻辑删除：客户的数据，并不从数据库删除，只是做了一个更新删除状态\n" +
                "物理删除：从数据删除\n" +
                "nginux在第九天的word\n" +
                "非mavenTomcat清理缓存，删除tomcat的webapps,logs等\n" +
                "\n" +
                "广告没用复合类的原因，页面一个表的数据就够\n" +
                "redis 键值对，存在内存中\n" +
                "ORM  MYBATIES H\n" +
                "缓存数据变更问题"));

        t.addCell(c1);

        PdfPCell c2 = new PdfPCell(new Phrase("Header2"));

        t.addCell(c2);

        PdfPCell c3 = new PdfPCell(new Phrase("Header3"));

        t.addCell(c3);

        t.addCell("1.1");

        t.addCell("1.2");

        t.addCell("1.3");

        section1.add(t);




//        Image image = Image.getInstance("C:\\Users\\cold\\Desktop\\abc.png");
//        image.setAbsolutePosition(100f, 50f);
//        image.scaleAbsolute(800, 800);
//        document.add(image);
        document.add(chapter1);
        document.close();
        pdfWriter.close();

    }
}
