
package departmentdetailsservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDepartmentByMgrEmailId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDepartmentByMgrEmailId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mgrEmailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDepartmentByMgrEmailId", propOrder = {
    "mgrEmailId"
})
public class GetDepartmentByMgrEmailId {

    @XmlElement(required = true)
    protected String mgrEmailId;

    /**
     * Gets the value of the mgrEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgrEmailId() {
        return mgrEmailId;
    }

    /**
     * Sets the value of the mgrEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgrEmailId(String value) {
        this.mgrEmailId = value;
    }

}
