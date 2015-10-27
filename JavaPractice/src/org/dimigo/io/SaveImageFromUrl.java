/**
 * 
 */
package org.dimigo.io;

import java.io.IOException;
import java.io.*;
import java.net.*;

/**
 * <pre>
 * JavaPractice
 * org.dimigo.io
 * |_ SaveImageFromUrl
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 26.
 * 오후 12:42:37
 * </pre>
 *
 * @author	: 장문광
 * @version	: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://ctgby.com/2013/10/injury_dog-bite/";
		try{			
			URL url = new URL(imageUrl);
			try (InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("Files/logo.png"))
					{
				byte[] buf =  new byte[512];
				int result;
				while((result = is.read(buf)) != -1){
					os.write(buf, 0,result);
				}
				System.out.println("Completed.");
			} catch (IOException e){
					e.printStackTrace();
			} 
		}catch(MalformedURLException e) {
			e.printStackTrace();
			
}
	}
}

