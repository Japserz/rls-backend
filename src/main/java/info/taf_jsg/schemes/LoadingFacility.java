//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://taf-jsg.info/schemes}CustomerNumber" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AdministrativeContactInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerNumber",
    "administrativeContactInformation"
})
@XmlRootElement(name = "LoadingFacility")
public class LoadingFacility {

    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "AdministrativeContactInformation", required = true)
    protected AdministrativeContactInformation administrativeContactInformation;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the administrativeContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeContactInformation }
     *     
     */
    public AdministrativeContactInformation getAdministrativeContactInformation() {
        return administrativeContactInformation;
    }

    /**
     * Sets the value of the administrativeContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeContactInformation }
     *     
     */
    public void setAdministrativeContactInformation(AdministrativeContactInformation value) {
        this.administrativeContactInformation = value;
    }

}