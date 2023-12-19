package org.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnection {

	public void getMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");
		connection.connect();

		int responsecode = connection.getResponseCode();
		System.out.println("The response code is "+responsecode);

		String responsemsg = connection.getResponseMessage();
		System.out.println("The response code is "+responsemsg);

		InputStream inputstream = connection.getInputStream();

		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferedreader.readLine())!=null) {
			buffer.append(line);

		}
		System.out.println(buffer);
	}

	public void postMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");

		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonbody = "{\"employee_name\":\"Doris Wilder\",\"employee_salary\":85600,\"employee_age\":23,\"profile_image\":\"\"}";

		byte[] inputjason = jsonbody.getBytes();

		OutputStream outputstream = connection.getOutputStream();

		outputstream.write(inputjason);
		System.out.println(connection.getResponseCode());

		InputStream inputstream = connection.getInputStream();

		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferedreader.readLine())!=null) {
			buffer.append(line);

		}
		System.out.println(buffer);

	}
	
	public void putMethodExample() throws IOException {
		
		URL url = new URL("	https://dummy.restapiexample.com/api/v1/update/7312");

		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonbody = "{\"employee_name\":\"Sharan Wilder\",\"employee_salary\":655600,\"employee_age\":30,\"profile_image\":\"\"}";

		byte[] inputjason = jsonbody.getBytes();

		OutputStream outputstream = connection.getOutputStream();

		outputstream.write(inputjason);
		System.out.println(connection.getResponseCode());

		InputStream inputstream = connection.getInputStream();

		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferedreader.readLine())!=null) {
			buffer.append(line);

		}
		System.out.println(buffer);
	}
	
	public void deleteMethodExample() throws IOException {
		
		URL url = new URL("		https://dummy.restapiexample.com/api/v1/delete/7312");

		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		System.out.println(connection.getResponseCode());

		InputStream inputstream = connection.getInputStream();

		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferedreader.readLine())!=null) {
			buffer.append(line);

		}
		System.out.println(buffer);
		
	}

	public static void main(String[] args) throws IOException {
		URLConnection urlcon = new URLConnection();
		//urlcon.getMethodExample();
		//urlcon.postMethodExample();
		//urlcon.putMethodExample();
		urlcon.deleteMethodExample();
	}

}


