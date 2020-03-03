package Webdrivercommands;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;
import java.io.IOException;



public class ImageExtractor {


    public static void main(String[] args) throws IOException {

        String  location = "\\C:\\Users\\siva\\Desktop\\Facebook_API_Setup_Tests.pdf";
        String pic ="\\C:\\Users\\siva\\Desktop\\pic";

        PDFUtil pdfUtil = new PDFUtil();

        pdfUtil.setImageDestinationPath(pic);
        pdfUtil.extractImages(location);
        //save pdf to image
        pdfUtil.savePdfAsImage(pic);
        //file comparison

        String actual ="\\C:\\Users\\siva\\Desktop\\Facebook_API_Setup_Tests.pdf";
        String expected ="\\C:\\Users\\siva\\Desktop\\drive.pdf";
      // boolean compare = pdfUtil.compare(actual,expected);
        //System.out.println("camparison completed : "+compare);

        //visual comparison

        pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
        pdfUtil.highlightPdfDifference(true);
        pdfUtil.setImageDestinationPath(pic);
        pdfUtil.compare(actual,expected);





    }

}
