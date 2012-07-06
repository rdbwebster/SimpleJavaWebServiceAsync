
package departmentdetailsservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for departmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="departmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departmentCostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentManagerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departmentDetails", namespace = "http://departmentdetailsservice/types", propOrder = {
    "departmentCostCenter",
    "departmentManagerEmail",
    "departmentName",
    "departmentNumber",
    "departmentOrg"
})
public class DepartmentDetails {

    protected String departmentCostCenter;
    protected String departmentManagerEmail;
    protected String departmentName;
    protected String departmentNumber;
    protected String departmentOrg;

    /**
     * Gets the value of the departmentCostCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentCostCenter() {
        return departmentCostCenter;
    }

    /**
     * Sets the value of the departmentCostCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentCostCenter(String value) {
        this.departmentCostCenter = value;
    }

    /**
     * Gets the value of the departmentManagerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentManagerEmail() {
        return departmentManagerEmail;
    }

    /**
     * Sets the value of the departmentManagerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentManagerEmail(String value) {
        this.departmentManagerEmail = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the departmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentNumber() {
        return departmentNumber;
    }

    /**
     * Sets the value of the departmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentNumber(String value) {
        this.departmentNumber = value;
    }

    /**
     * Gets the value of the departmentOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentOrg() {
        return departmentOrg;
    }

    /**
     * Sets the value of the departmentOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentOrg(String value) {
        this.departmentOrg = value;
    }

}
