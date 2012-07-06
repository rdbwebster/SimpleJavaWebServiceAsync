
package departmentdetailsservice.client;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DepartmentFinderResponse", targetNamespace = "http://departmentdetailsservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DepartmentFinderResponse {


    /**
     * 
     * @param departmentByMgrCallback
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "getDepartmentByMgrCallback", targetNamespace = "http://departmentdetailsservice/", className = "departmentdetailsservice.client.GetDepartmentByMgrCallback")
    public void getDepartmentByMgrCallback(
        @WebParam(name = "departmentByMgrCallback", targetNamespace = "")
        DepartmentDetails departmentByMgrCallback);

}