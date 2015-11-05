package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * <pre>
 * org.dimigo.io
 *   |_ NaverSearch
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class NaverSearch {

	public static final String NAVER_OPEN_URL = "http://openapi.naver.com/search";
	public static final String SEARCH_KEY = "f45d2780e74669231a450c8cb3ffc78f";
	
	public static void main(String[] args) {		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	String keyword = null;
	    	
	    	/********************************************************
	         * ǥ���Է����� �˻��� Ű���带 �Է¹ޱ�
	         * > Ű���带 �Է��ϼ��� => ��Ÿ����
	         ********************************************************/
	    	
	    	System.out.println("Ű���带 �Է��� => ");
	    	try(InputStreamReader isr = new InputStreamReader(System.in)){
	    		char[] c = new char[128];
	    		int res = isr.read(c);
	    		keyword = new String(c).trim();
	    	} catch(IOException e){
	    		throw e;
	    	}
	    	
	    	StringBuffer sb = new StringBuffer(NAVER_OPEN_URL);
	    	sb.append("?key=").append(SEARCH_KEY).append("&query=").append(keyword)
	    	  .append("&display=10&start=1&target=movie");
	    	
	    	HttpGet httpget = new HttpGet(sb.toString());
	        System.out.println("Executing request " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

	            @Override
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }

	        };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("----------------------------------------");
	        System.out.println(responseBody);	        
	        
	        List<Movie> movieList = NaverMovieXMLParser.parse(responseBody);
	        
	        System.out.println(movieList);
	        
	        /********************************************************
	         * �˻��� ������� ����ϱ�
	         * 1. ��Ÿ���� ���Ǽҵ� 8 - [����ī ���̻�, ����ġ�� �� ���]
	         * 2. ��Ÿ ���� �ؼַ���: �α� �� - [�縮��Ƽ ����, �� �൨��, .. ]
	         * 3. ��Ÿ����: ��� ���� - [�ظ��� ����, ��ũ �ع�, ĳ�� �Ǽ�, .. ]
	         ********************************************************/
	        
	        // files/movies.txt ���Ͽ� write�ϱ�
	        try(FileWriter fw = new FileWriter("files/movies.txt");
	        	BufferedWriter bw = new BufferedWriter(fw)){
	        	int i = 0;
	        	for(Movie m : movieList){
	        		String res = (++i) + ". " + m.getTitle() + " - "
	        				+ "[";
	        		for(String s : m.getActors()){
	        			res += s + ", ";        			
	        		}
	        		res = res.substring(0, res.length()-2);
	        		res += "]\n";
	        		bw.write(res);
	        	}
	        } catch(IOException e){
	        	throw e;
	        }
	        
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				if(httpclient != null) httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	}

}