


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



@WebService(name = "ServiceHello", targetNamespace = "http://kwang.topsci.com/")

public interface ServiceHello {


    public String getValue(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
