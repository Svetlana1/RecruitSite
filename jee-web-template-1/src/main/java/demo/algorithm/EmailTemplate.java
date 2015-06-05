package demo.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import demo.webtasks.model.User;

public class EmailTemplate {

	private static String readEmail() throws IOException {
		
		InputStream in=
		EmailTemplate.class.getClassLoader().getResourceAsStream("emailMessage.email");
		Reader reader=new InputStreamReader(in);
		BufferedReader buffer = new BufferedReader(reader);
		String text = "";
		String line = "";
		while ((line = buffer.readLine()) != null) {
			text += line;
		}
		return text;
	}

	public static String getEmailTemplate(User user) {
		Map<String, Object> params = new HashMap<>();
		params.put("email", user.getEmail());
		params.put("securiteNumber", user.getSecuriteNumber());
		String text="";
		try {
			text = readEmail();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return resolveVeriables(text, params);
	}

	private static String resolveVeriables(String text,
			Map<String, Object> params) {
		String result = text;
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			String var = "${"+entry.getKey()+"}";
			String value = entry.getValue() == null ? "" : entry.getValue()
					.toString();
			result=result.replace(var, value);
		}
		return result;
	}
}
