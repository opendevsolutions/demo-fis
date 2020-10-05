
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
 *         &lt;element name="InvertCaseFirstAdjustStringToCurrentResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "invertCaseFirstAdjustStringToCurrentResult"
})
@XmlRootElement(name = "InvertCaseFirstAdjustStringToCurrentResponse")
public class InvertCaseFirstAdjustStringToCurrentResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InvertCaseFirstAdjustStringToCurrentResult", required = true)
    protected String invertCaseFirstAdjustStringToCurrentResult;

    /**
     * Gets the value of the invertCaseFirstAdjustStringToCurrentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvertCaseFirstAdjustStringToCurrentResult() {
        return invertCaseFirstAdjustStringToCurrentResult;
    }

    /**
     * Sets the value of the invertCaseFirstAdjustStringToCurrentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvertCaseFirstAdjustStringToCurrentResult(String value) {
        this.invertCaseFirstAdjustStringToCurrentResult = value;
    }

}
