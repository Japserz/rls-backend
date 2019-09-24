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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}Location"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ResponsibleRU"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}WagonLocationStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ScheduledTimeAtLocation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ExceptionTimeAtLocation"/>
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
    "location",
    "responsibleRU",
    "wagonLocationStatus",
    "scheduledTimeAtLocation",
    "exceptionTimeAtLocation"
})
@XmlRootElement(name = "ExceptionPoint")
public class ExceptionPoint {

    @XmlElement(name = "Location", required = true)
    protected LocationIdent location;
    @XmlElement(name = "ResponsibleRU")
    protected int responsibleRU;
    @XmlElement(name = "WagonLocationStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wagonLocationStatus;
    @XmlElement(name = "ScheduledTimeAtLocation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTimeAtLocation;
    @XmlElement(name = "ExceptionTimeAtLocation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exceptionTimeAtLocation;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setLocation(LocationIdent value) {
        this.location = value;
    }

    /**
     * Gets the value of the responsibleRU property.
     * 
     */
    public int getResponsibleRU() {
        return responsibleRU;
    }

    /**
     * Sets the value of the responsibleRU property.
     * 
     */
    public void setResponsibleRU(int value) {
        this.responsibleRU = value;
    }

    /**
     * Gets the value of the wagonLocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWagonLocationStatus() {
        return wagonLocationStatus;
    }

    /**
     * Sets the value of the wagonLocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWagonLocationStatus(String value) {
        this.wagonLocationStatus = value;
    }

    /**
     * Gets the value of the scheduledTimeAtLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTimeAtLocation() {
        return scheduledTimeAtLocation;
    }

    /**
     * Sets the value of the scheduledTimeAtLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTimeAtLocation(XMLGregorianCalendar value) {
        this.scheduledTimeAtLocation = value;
    }

    /**
     * Gets the value of the exceptionTimeAtLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceptionTimeAtLocation() {
        return exceptionTimeAtLocation;
    }

    /**
     * Sets the value of the exceptionTimeAtLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceptionTimeAtLocation(XMLGregorianCalendar value) {
        this.exceptionTimeAtLocation = value;
    }

}