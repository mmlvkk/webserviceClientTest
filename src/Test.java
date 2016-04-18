

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class Test {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL wsdlUrl = new URL("http://localhost:8080/hello?wsdl");
        Service s = Service.create(wsdlUrl, new QName("http://kwang.topsci.com/","ServiceHelloService"));
        ServiceHello hs = s.getPort(new QName("http://kwang.topsci.com/","ServiceHelloPort"), ServiceHello.class);
        String ret = hs.getValue("200 OK");
        System.out.println(ret);
		
	}

}
