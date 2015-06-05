package demo.algorithm;

import com.pdfcrowd.*;
import java.io.*;

public class PdfcrowdTest {
	public static void main(String[] args) {

		try {
			FileOutputStream fileStream;

			// create an API client instance
			Client client = new Client("Recruit",
					"6db4f6f6ff9cd840a5594e0f3cd3e940");

			// convert a web page and save the PDF to a file
			fileStream = new FileOutputStream("example.pdf");
			client.convertURI("http://example.com/", fileStream);
			fileStream.close();

			// convert an HTML string and store the PDF into a byte array
			ByteArrayOutputStream memStream = new ByteArrayOutputStream();
			String html = "<html><body>In-memory HTML.</body></html>";
			client.convertHtml(html, memStream);

			// convert an HTML file
			fileStream = new FileOutputStream("file2.pdf");
			// File file=new File("resume.html");
//			client.convertURI(
//					"/employee/home.php",
//					fileStream);
			 client.convertFile("D:\\TestJava\\3course2sem\\Cursach\\jee-web-template-1\\src\\main\\webapp\\JSPFile.jsp",
			 fileStream);
			fileStream.close();

			// retrieve the number of tokens in your account
			Integer ntokens = client.numTokens();
		} catch (PdfcrowdError why) {
			System.err.println(why.getMessage());
		} catch (IOException exc) {
			// handle the exception
		}
	}
}
