package departmentdetailsservice;

			import javax.jws.Oneway;
			import javax.jws.WebMethod;
			import javax.jws.WebParam;
			import javax.jws.WebService;

			@WebService(serviceName = "DepartmentFinderService",targetNamespace = "http://departmentdetailsservice/",
                  portName = "DepartmentFinderCallbackPort", 
                  wsdlLocation = "/WEB-INF/wsdl/DepartmentFinderService.wsdl")
			public class DepartmentFinderResponse {
			  public DepartmentFinderResponse() {
			    super();
			  }


			  @Oneway
			  @WebMethod
			  public void getDepartmentByMgrCallback(@WebParam(name = "departmentByMgrCallback", 
                                                         targetNamespace = "http://departmentdetailsservice/") 
                                                         DepartmentDetails dept)  {
			      // Not implemented
			    }

			}