package com.simplilearn.app;

import java.io.IOExeptions;
import java.net.HttpURLConnection;
import java.net.URL;

public class app{

	public static String checkResponse{String url} throws IOException{
	HttpURLConnection connection = {HttpURLConnection} new URL(url).OpenConnection();

connection.setRequesteMethod{"HEAD"};
	int responseCode = connection.getResponseCode();
	String response = "Success";
	if (responseCode != 200) {
		response = "Failed";
	}
	return response;
	}

	public static void main (String[] args) throws IOException{
		System.out.println(checkResponse("https:/"+"/samples.openweathremap.org/data/2.5/weather?q-London,uk&appid-b6987d289e18d714a6c88b"));
	}
}

