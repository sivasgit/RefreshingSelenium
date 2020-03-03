package Webdrivercommands;

import com.testautomationguru.utility.PDFUtil;
import java.io.IOException;



public class ReadPDFText {

    public static void main(String[] args) throws IOException {

        String pageLocation ="F:/PDF GUIDES-TUTORIALSPOINT/java.pdf";

       PDFUtil pdfutil = new PDFUtil();
        //page count

        int count = pdfutil.getPageCount(pageLocation);
        System.out.println("Number of Pages : "+count);

        String content = pdfutil.getText(pageLocation);
        System.out.println("Content is :"+ content);

        System.out.println("**********************");

        String pageFromTo = pdfutil.getText(pageLocation,2,6);
        System.out.println("pages from "+pageFromTo);





    }
}
