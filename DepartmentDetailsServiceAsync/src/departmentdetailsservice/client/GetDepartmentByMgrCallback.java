
package departmentdetailsservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDepartmentByMgrCallback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDepartmentByMgrCallback">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentByMgrCallback" type="{http://departmentdetailsservice/types}departmentDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDepartmentByMgrCallback", propOrder = {
    "departmentByMgrCallback"
})
public class GetDepartmentByMgrCallback {

    @XmlElement(required = true)
    protected DepartmentDetails departmentByMgrCallback;

    /**
     * Gets the value of the departmentByMgrCallback property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentDetails }
     *     
     */
    public DepartmentDetails getDepartmentByMgrCallback() {
        return departmentByMgrCallback;
    }

    /**
     * Sets the value of the departmentByMgrCallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentDetails }
     *     
     */
    public void setDepartmentByMgrCallback(DepartmentDetails value) {
        this.departmentByMgrCallback = value;
    }

}
