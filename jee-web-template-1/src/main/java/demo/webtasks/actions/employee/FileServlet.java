package demo.webtasks.actions.employee;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.algorithm.Client;
import demo.algorithm.PdfcrowdError;

/**
 * The File servlet for serving from absolute path.
 * 
 * @author BalusC
 * @link http://balusc.blogspot.com/2007/07/fileservlet.html
 */
public class FileServlet extends HttpServlet {

	// Constants
	// ----------------------------------------------------------------------------------

	private static final int DEFAULT_BUFFER_SIZE = 10240; // 10KB.

	// Properties
	// ---------------------------------------------------------------------------------

	private String filePath;

	// Actions
	// ------------------------------------------------------------------------------------

	public void init() throws ServletException {

		// Define base path somehow. You can define it as init-param of the
		// servlet.
	//
		//this.filePath = "D:\\TestJava\\3course2sem\\Cursach\\jee-web-template-1\\src\\main\\webapp\\JSPFile.jsp";
		// "D:\\TestJava\\3course2sem\\Cursach\\jee-web-template-1\\example.pdf";

		// In a Windows environment with the Applicationserver running on the
		// c: volume, the above path is exactly the same as "c:\files".
		// In UNIX, it is just straightforward "/files".
	}

	private String htmlToPdv() {
		String filePdv = "hello.pdf";
		try {
			FileOutputStream fileStream;

			// create an API client instance
			Client client = new Client("Recruit",
					"6db4f6f6ff9cd840a5594e0f3cd3e940");

			// convert a web page and save the PDF to a file
			// fileStream = new FileOutputStream("example.pdf");
			// client.convertURI("http://example.com/", fileStream);
			// fileStream.close();
			//
			// // convert an HTML string and store the PDF into a byte array
			 ByteArrayOutputStream memStream = new ByteArrayOutputStream();
			 String html = "<html><body>In-memory HTML.</body></html>";
			 client.convertHtml(html, memStream);

			// convert an HTML file
			fileStream = new FileOutputStream(filePdv);
			// File file=new File("resume.html");
			// client.convertURI(
			// "/employee/home.php",
			// fileStream);
			client.convertFile(
					"D:\\TestJava\\3course2sem\\Cursach\\jee-web-template-1\\src\\main\\webapp\\new.jsp",
					fileStream);
			fileStream.close();

			// retrieve the number of tokens in your account
			Integer ntokens = client.numTokens();
		} catch (PdfcrowdError why) {
			System.err.println(why.getMessage());
		} catch (IOException exc) {
			// handle the exception
		}
		return filePdv;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Get requested file by path info.
		String filePath=htmlToPdv();
		String requestedFile = request.getPathInfo();

		// Check if file is actually supplied to the request URI.
		if (requestedFile == null) {
			// Do your thing if the file is not supplied to the request URI.
			// Throw an exception, or send 404, or show default/warning page, or
			// just ignore it.
			response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
			return;
		}

		// Decode the file name (might contain spaces and on) and prepare file
		// object.
		File file = new File(filePath);

		// Check if file actually exists in filesystem.
		if (!file.exists()) {
			// Do your thing if the file appears to be non-existing.
			// Throw an exception, or send 404, or show default/warning page, or
			// just ignore it.
			response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
			return;
		}

		// Get content type by filename.
		// String contentType = getServletContext().getMimeType(file.getName());

		// If content type is unknown, then set the default value.
		// For all content types, see:
		// http://www.w3schools.com/media/media_mimeref.asp
		// To add new content types, add new mime-mapping entry in web.xml.
		// if (contentType == null) {
		String contentType = "application/pdf";
		// }

		// Init servlet response.
		response.reset();
		response.setBufferSize(DEFAULT_BUFFER_SIZE);
		response.setContentType(contentType);
		response.setHeader("Content-Length", String.valueOf(file.length()));
		response.setHeader("Content-Disposition", "attachment; filename=\""
				+ file.getName() + "\"");

		// Prepare streams.
		BufferedInputStream input = null;
		BufferedOutputStream output = null;

		try {
			// Open streams.
			input = new BufferedInputStream(new FileInputStream(file),
					DEFAULT_BUFFER_SIZE);
			output = new BufferedOutputStream(response.getOutputStream(),
					DEFAULT_BUFFER_SIZE);

			// Write file contents to response.
			byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
			int length;
			while ((length = input.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}
		} finally {
			// Gently close streams.
			close(output);
			close(input);
		}
	}

	// Helpers (can be refactored to public utility class)
	// ----------------------------------------

	private static void close(Closeable resource) {
		if (resource != null) {
			try {
				resource.close();
			} catch (IOException e) {
				// Do your thing with the exception. Print it, log it or mail
				// it.
				e.printStackTrace();
			}
		}
	}

}