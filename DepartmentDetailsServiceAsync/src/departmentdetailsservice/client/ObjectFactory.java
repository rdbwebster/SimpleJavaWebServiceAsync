
package departmentdetailsservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the departmentdetailsservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDepartmentByMgrEmailIdResponse_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentByMgrEmailIdResponse");
    private final static QName _GetDepartments_QNAME = new QName("http://departmentdetailsservice/", "getDepartments");
    private final static QName _GetDepartmentByMgrCallback_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentByMgrCallback");
    private final static QName _GetDepartmentDetailsResponse_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentDetailsResponse");
    private final static QName _DepartmentFinderFault_QNAME = new QName("http://departmentdetailsservice/", "DepartmentFinderFault");
    private final static QName _GetDepartmentDetails_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentDetails");
    private final static QName _GetDepartmentByMgrEmailId_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentByMgrEmailId");
    private final static QName _GetDepartmentsResponse_QNAME = new QName("http://departmentdetailsservice/", "getDepartmentsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: departmentdetailsservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link GetDepartmentDetailsResponse }
     * 
     */
    public GetDepartmentDetailsResponse createGetDepartmentDetailsResponse() {
        return new GetDepartmentDetailsResponse();
    }

    /**
     * Create an instance of {@link GetDepartmentDetails }
     * 
     */
    public GetDepartmentDetails createGetDepartmentDetails() {
        return new GetDepartmentDetails();
    }

    /**
     * Create an instance of {@link DepartmentDetails }
     * 
     */
    public DepartmentDetails createDepartmentDetails() {
        return new DepartmentDetails();
    }

    /**
     * Create an instance of {@link GetDepartmentByMgrEmailId }
     * 
     */
    public GetDepartmentByMgrEmailId createGetDepartmentByMgrEmailId() {
        return new GetDepartmentByMgrEmailId();
    }

    /**
     * Create an instance of {@link GetDepartmentByMgrEmailIdResponse }
     * 
     */
    public GetDepartmentByMgrEmailIdResponse createGetDepartmentByMgrEmailIdResponse() {
        return new GetDepartmentByMgrEmailIdResponse();
    }

    /**
     * Create an instance of {@link GetDepartmentsResponse }
     * 
     */
    public GetDepartmentsResponse createGetDepartmentsResponse() {
        return new GetDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetDepartmentByMgrCallback }
     * 
     */
    public GetDepartmentByMgrCallback createGetDepartmentByMgrCallback() {
        return new GetDepartmentByMgrCallback();
    }

    /**
     * Create an instance of {@link GetDepartments }
     * 
     */
    public GetDepartments createGetDepartments() {
        return new GetDepartments();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentByMgrEmailIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentByMgrEmailIdResponse")
    public JAXBElement<GetDepartmentByMgrEmailIdResponse> createGetDepartmentByMgrEmailIdResponse(GetDepartmentByMgrEmailIdResponse value) {
        return new JAXBElement<GetDepartmentByMgrEmailIdResponse>(_GetDepartmentByMgrEmailIdResponse_QNAME, GetDepartmentByMgrEmailIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartments")
    public JAXBElement<GetDepartments> createGetDepartments(GetDepartments value) {
        return new JAXBElement<GetDepartments>(_GetDepartments_QNAME, GetDepartments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentByMgrCallback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentByMgrCallback")
    public JAXBElement<GetDepartmentByMgrCallback> createGetDepartmentByMgrCallback(GetDepartmentByMgrCallback value) {
        return new JAXBElement<GetDepartmentByMgrCallback>(_GetDepartmentByMgrCallback_QNAME, GetDepartmentByMgrCallback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentDetailsResponse")
    public JAXBElement<GetDepartmentDetailsResponse> createGetDepartmentDetailsResponse(GetDepartmentDetailsResponse value) {
        return new JAXBElement<GetDepartmentDetailsResponse>(_GetDepartmentDetailsResponse_QNAME, GetDepartmentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "DepartmentFinderFault")
    public JAXBElement<FaultBean> createDepartmentFinderFault(FaultBean value) {
        return new JAXBElement<FaultBean>(_DepartmentFinderFault_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentDetails")
    public JAXBElement<GetDepartmentDetails> createGetDepartmentDetails(GetDepartmentDetails value) {
        return new JAXBElement<GetDepartmentDetails>(_GetDepartmentDetails_QNAME, GetDepartmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentByMgrEmailId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentByMgrEmailId")
    public JAXBElement<GetDepartmentByMgrEmailId> createGetDepartmentByMgrEmailId(GetDepartmentByMgrEmailId value) {
        return new JAXBElement<GetDepartmentByMgrEmailId>(_GetDepartmentByMgrEmailId_QNAME, GetDepartmentByMgrEmailId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://departmentdetailsservice/", name = "getDepartmentsResponse")
    public JAXBElement<GetDepartmentsResponse> createGetDepartmentsResponse(GetDepartmentsResponse value) {
        return new JAXBElement<GetDepartmentsResponse>(_GetDepartmentsResponse_QNAME, GetDepartmentsResponse.class, null, value);
    }

}
