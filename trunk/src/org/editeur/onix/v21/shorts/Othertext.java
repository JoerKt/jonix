//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}d102"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}d103" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}d104"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}d105"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}d106"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}d107" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b374" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}d108" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}d109" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b324"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b325"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="OtherText" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="othertext" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "d102",
    "d103",
    "d104",
    "d105",
    "d106",
    "d107",
    "b374",
    "d108",
    "d109",
    "b324",
    "b325"
})
@XmlRootElement(name = "othertext")
public class Othertext {

    @XmlElement(required = true)
    protected D102 d102;
    protected D103 d103;
    protected D104 d104;
    protected D105 d105;
    protected D106 d106;
    protected D107 d107;
    protected B374 b374;
    protected D108 d108;
    protected D109 d109;
    protected B324 b324;
    protected B325 b325;
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
     * Gets the value of the d102 property.
     * 
     * @return
     *     possible object is
     *     {@link D102 }
     *     
     */
    public D102 getD102() {
        return d102;
    }

    /**
     * Sets the value of the d102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D102 }
     *     
     */
    public void setD102(D102 value) {
        this.d102 = value;
    }

    /**
     * Gets the value of the d103 property.
     * 
     * @return
     *     possible object is
     *     {@link D103 }
     *     
     */
    public D103 getD103() {
        return d103;
    }

    /**
     * Sets the value of the d103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D103 }
     *     
     */
    public void setD103(D103 value) {
        this.d103 = value;
    }

    /**
     * Gets the value of the d104 property.
     * 
     * @return
     *     possible object is
     *     {@link D104 }
     *     
     */
    public D104 getD104() {
        return d104;
    }

    /**
     * Sets the value of the d104 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D104 }
     *     
     */
    public void setD104(D104 value) {
        this.d104 = value;
    }

    /**
     * Gets the value of the d105 property.
     * 
     * @return
     *     possible object is
     *     {@link D105 }
     *     
     */
    public D105 getD105() {
        return d105;
    }

    /**
     * Sets the value of the d105 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D105 }
     *     
     */
    public void setD105(D105 value) {
        this.d105 = value;
    }

    /**
     * Gets the value of the d106 property.
     * 
     * @return
     *     possible object is
     *     {@link D106 }
     *     
     */
    public D106 getD106() {
        return d106;
    }

    /**
     * Sets the value of the d106 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D106 }
     *     
     */
    public void setD106(D106 value) {
        this.d106 = value;
    }

    /**
     * Gets the value of the d107 property.
     * 
     * @return
     *     possible object is
     *     {@link D107 }
     *     
     */
    public D107 getD107() {
        return d107;
    }

    /**
     * Sets the value of the d107 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D107 }
     *     
     */
    public void setD107(D107 value) {
        this.d107 = value;
    }

    /**
     * Gets the value of the b374 property.
     * 
     * @return
     *     possible object is
     *     {@link B374 }
     *     
     */
    public B374 getB374() {
        return b374;
    }

    /**
     * Sets the value of the b374 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B374 }
     *     
     */
    public void setB374(B374 value) {
        this.b374 = value;
    }

    /**
     * Gets the value of the d108 property.
     * 
     * @return
     *     possible object is
     *     {@link D108 }
     *     
     */
    public D108 getD108() {
        return d108;
    }

    /**
     * Sets the value of the d108 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D108 }
     *     
     */
    public void setD108(D108 value) {
        this.d108 = value;
    }

    /**
     * Gets the value of the d109 property.
     * 
     * @return
     *     possible object is
     *     {@link D109 }
     *     
     */
    public D109 getD109() {
        return d109;
    }

    /**
     * Sets the value of the d109 property.
     * 
     * @param value
     *     allowed object is
     *     {@link D109 }
     *     
     */
    public void setD109(D109 value) {
        this.d109 = value;
    }

    /**
     * Gets the value of the b324 property.
     * 
     * @return
     *     possible object is
     *     {@link B324 }
     *     
     */
    public B324 getB324() {
        return b324;
    }

    /**
     * Sets the value of the b324 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B324 }
     *     
     */
    public void setB324(B324 value) {
        this.b324 = value;
    }

    /**
     * Gets the value of the b325 property.
     * 
     * @return
     *     possible object is
     *     {@link B325 }
     *     
     */
    public B325 getB325() {
        return b325;
    }

    /**
     * Sets the value of the b325 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B325 }
     *     
     */
    public void setB325(B325 value) {
        this.b325 = value;
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
            return "OtherText";
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
            return "othertext";
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
