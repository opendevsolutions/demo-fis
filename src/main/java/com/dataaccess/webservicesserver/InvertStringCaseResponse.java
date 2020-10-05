
package com.dataaccess.webservicesserver;

import java.io.Serializable;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvertStringCaseResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invertStringCaseResult"
})
@XmlRootElement(name = "InvertStringCaseResponse")
public class InvertStringCaseResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InvertStringCaseResult", required = true)
    protected String invertStringCaseResult;

    /**
     * Gets the value of the invertStringCaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvertStringCaseResult() {
        return invertStringCaseResult;
    }

    /**
     * Sets the value of the invertStringCaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvertStringCaseResult(String value) {
        this.invertStringCaseResult = value;
    }

}
