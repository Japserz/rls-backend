//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://taf-jsg.info/schemes}SpecialServiceDescriptionCode" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AvailabilityFrom" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AvailabilityTo" minOccurs="0"/>
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
    "specialServiceDescriptionCode",
    "availabilityFrom",
    "availabilityTo"
})
@XmlRootElement(name = "SpecialServiceDescription")
public class SpecialServiceDescription {

    @XmlElement(name = "SpecialServiceDescriptionCode")
    protected BigInteger specialServiceDescriptionCode;
    @XmlElement(name = "AvailabilityFrom")
    protected LocationIdent availabilityFrom;
    @XmlElement(name = "AvailabilityTo")
    protected LocationIdent availabilityTo;

    /**
     * Gets the value of the specialServiceDescriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialServiceDescriptionCode() {
        return specialServiceDescriptionCode;
    }

    /**
     * Sets the value of the specialServiceDescriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialServiceDescriptionCode(BigInteger value) {
        this.specialServiceDescriptionCode = value;
    }

    /**
     * Gets the value of the availabilityFrom property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getAvailabilityFrom() {
        return availabilityFrom;
    }

    /**
     * Sets the value of the availabilityFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setAvailabilityFrom(LocationIdent value) {
        this.availabilityFrom = value;
    }

    /**
     * Gets the value of the availabilityTo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getAvailabilityTo() {
        return availabilityTo;
    }

    /**
     * Sets the value of the availabilityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setAvailabilityTo(LocationIdent value) {
        this.availabilityTo = value;
    }

}