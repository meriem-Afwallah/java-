package hello;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;



public class DownloadMain {

	public static void main(String[] args) {
		URI uri = URI.create("http://www.example.com");
		try {
			URL is = uri.toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	
		
	}

}
