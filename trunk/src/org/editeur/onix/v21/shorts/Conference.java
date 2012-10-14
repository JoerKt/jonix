//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b051" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b052"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b341" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b053" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b342" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b054" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b055" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}conferencesponsor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="Conference" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="conference" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b051",
    "b052",
    "b341",
    "b053",
    "b342",
    "b054",
    "b055",
    "conferencesponsor",
    "website"
})
@XmlRootElement(name = "conference")
public class Conference {

    protected B051 b051;
    @XmlElement(required = true)
    protected B052 b052;
    protected B341 b341;
    protected B053 b053;
    protected B342 b342;
    protected B054 b054;
    protected B055 b055;
    protected List<Conferencesponsor> conferencesponsor;
    protected List<Website> website;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "transliteration")
    protected List138 transliteration;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the value of the b051 property.
     * 
     * @return
     *     possible object is
     *     {@link B051 }
     *     
     */
    public B051 getB051() {
        return b051;
    }

    /**
     * Sets the value of the b051 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B051 }
     *     
     */
    public void setB051(B051 value) {
        this.b051 = value;
    }

    /**
     * Gets the value of the b052 property.
     * 
     * @return
     *     possible object is
     *     {@link B052 }
     *     
     */
    public B052 getB052() {
        return b052;
    }

    /**
     * Sets the value of the b052 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B052 }
     *     
     */
    public void setB052(B052 value) {
        this.b052 = value;
    }

    /**
     * Gets the value of the b341 property.
     * 
     * @return
     *     possible object is
     *     {@link B341 }
     *     
     */
    public B341 getB341() {
        return b341;
    }

    /**
     * Sets the value of the b341 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B341 }
     *     
     */
    public void setB341(B341 value) {
        this.b341 = value;
    }

    /**
     * Gets the value of the b053 property.
     * 
     * @return
     *     possible object is
     *     {@link B053 }
     *     
     */
    public B053 getB053() {
        return b053;
    }

    /**
     * Sets the value of the b053 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B053 }
     *     
     */
    public void setB053(B053 value) {
        this.b053 = value;
    }

    /**
     * Gets the value of the b342 property.
     * 
     * @return
     *     possible object is
     *     {@link B342 }
     *     
     */
    public B342 getB342() {
        return b342;
    }

    /**
     * Sets the value of the b342 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B342 }
     *     
     */
    public void setB342(B342 value) {
        this.b342 = value;
    }

    /**
     * Gets the value of the b054 property.
     * 
     * @return
     *     possible object is
     *     {@link B054 }
     *     
     */
    public B054 getB054() {
        return b054;
    }

    /**
     * Sets the value of the b054 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B054 }
     *     
     */
    public void setB054(B054 value) {
        this.b054 = value;
    }

    /**
     * Gets the value of the b055 property.
     * 
     * @return
     *     possible object is
     *     {@link B055 }
     *     
     */
    public B055 getB055() {
        return b055;
    }

    /**
     * Sets the value of the b055 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B055 }
     *     
     */
    public void setB055(B055 value) {
        this.b055 = value;
    }

    /**
     * Gets the value of the conferencesponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferencesponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferencesponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conferencesponsor }
     * 
     * 
     */
    public List<Conferencesponsor> getConferencesponsor() {
        if (conferencesponsor == null) {
            conferencesponsor = new ArrayList<Conferencesponsor>();
        }
        return this.conferencesponsor;
    }

    /**
     * Gets the value of the website property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the website property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Website }
     * 
     * 
     */
    public List<Website> getWebsite() {
        if (website == null) {
            website = new ArrayList<Website>();
        }
        return this.website;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        if (refname == null) {
            return "Conference";
        } else {
            return refname;
        }
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        if (shortname == null) {
            return "conference";
        } else {
            return shortname;
        }
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the textformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextformat() {
        if (textformat == null) {
            return "00";
        } else {
            return textformat;
        }
    }

    /**
     * Sets the value of the textformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextformat(String value) {
        this.textformat = value;
    }

    /**
     * Gets the value of the textcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextcase() {
        if (textcase == null) {
            return "00";
        } else {
            return textcase;
        }
    }

    /**
     * Sets the value of the textcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextcase(String value) {
        this.textcase = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link List74 }
     *     
     */
    public List74 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link List74 }
     *     
     */
    public void setLanguage(List74 value) {
        this.language = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link List138 }
     *     
     */
    public List138 getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link List138 }
     *     
     */
    public void setTransliteration(List138 value) {
        this.transliteration = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        if (sourcetype == null) {
            return "00";
        } else {
            return sourcetype;
        }
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}