
package departmentdetailsservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDepartmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDepartmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDepartmentDetails", propOrder = {
    "deptNumber"
})
public class GetDepartmentDetails {

    @XmlElement(required = true)
    protected String deptNumber;

    /**
     * Gets the value of the deptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNumber() {
        return deptNumber;
    }

    /**
     * Sets the value of the deptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNumber(String value) {
        this.deptNumber = value;
    }

}
