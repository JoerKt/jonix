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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h208"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b004"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b005" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}productidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;sequence minOccurs="0">
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b012"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b333" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}productformfeature" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b013" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b225" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b014" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b005"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}productidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;sequence minOccurs="0">
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b012"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b333" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}productformfeature" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b013" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b225" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b014" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}productidentifier" maxOccurs="unbounded"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;sequence minOccurs="0">
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b012"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b333" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}productformfeature" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b013" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b225" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}b014" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b012"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b333" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}productformfeature" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b013" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b225" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b014" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b210" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b384" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b385" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b211"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b212" minOccurs="0"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b213" minOccurs="0"/>
 *           &lt;sequence minOccurs="0">
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b214"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}b215" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b216" minOccurs="0"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}b277" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}publisher" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="RelatedProduct" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="relatedproduct" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "relatedproduct")
public class Relatedproduct {

    @XmlElementRefs({
        @XmlElementRef(name = "b213", namespace = "http://www.editeur.org/onix/2.1/short", type = B213 .class, required = false),
        @XmlElementRef(name = "b384", namespace = "http://www.editeur.org/onix/2.1/short", type = B384 .class, required = false),
        @XmlElementRef(name = "productidentifier", namespace = "http://www.editeur.org/onix/2.1/short", type = Productidentifier.class, required = false),
        @XmlElementRef(name = "b214", namespace = "http://www.editeur.org/onix/2.1/short", type = B214 .class, required = false),
        @XmlElementRef(name = "productformfeature", namespace = "http://www.editeur.org/onix/2.1/short", type = Productformfeature.class, required = false),
        @XmlElementRef(name = "b211", namespace = "http://www.editeur.org/onix/2.1/short", type = B211 .class, required = false),
        @XmlElementRef(name = "b012", namespace = "http://www.editeur.org/onix/2.1/short", type = B012 .class, required = false),
        @XmlElementRef(name = "b385", namespace = "http://www.editeur.org/onix/2.1/short", type = B385 .class, required = false),
        @XmlElementRef(name = "b004", namespace = "http://www.editeur.org/onix/2.1/short", type = B004 .class, required = false),
        @XmlElementRef(name = "b215", namespace = "http://www.editeur.org/onix/2.1/short", type = B215 .class, required = false),
        @XmlElementRef(name = "b005", namespace = "http://www.editeur.org/onix/2.1/short", type = B005 .class, required = false),
        @XmlElementRef(name = "h208", namespace = "http://www.editeur.org/onix/2.1/short", type = H208 .class, required = false),
        @XmlElementRef(name = "b333", namespace = "http://www.editeur.org/onix/2.1/short", type = B333 .class, required = false),
        @XmlElementRef(name = "b225", namespace = "http://www.editeur.org/onix/2.1/short", type = B225 .class, required = false),
        @XmlElementRef(name = "b210", namespace = "http://www.editeur.org/onix/2.1/short", type = B210 .class, required = false),
        @XmlElementRef(name = "b014", namespace = "http://www.editeur.org/onix/2.1/short", type = B014 .class, required = false),
        @XmlElementRef(name = "publisher", namespace = "http://www.editeur.org/onix/2.1/short", type = Publisher.class, required = false),
        @XmlElementRef(name = "b216", namespace = "http://www.editeur.org/onix/2.1/short", type = B216 .class, required = false),
        @XmlElementRef(name = "website", namespace = "http://www.editeur.org/onix/2.1/short", type = Website.class, required = false),
        @XmlElementRef(name = "b013", namespace = "http://www.editeur.org/onix/2.1/short", type = B013 .class, required = false),
        @XmlElementRef(name = "b277", namespace = "http://www.editeur.org/onix/2.1/short", type = B277 .class, required = false),
        @XmlElementRef(name = "b212", namespace = "http://www.editeur.org/onix/2.1/short", type = B212 .class, required = false)
    })
    protected List<java.lang.Object> content;
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
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "B005" is used by two different parts of a schema. See: 
     * line 4549 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * line 4536 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B213 }
     * {@link B384 }
     * {@link Productidentifier }
     * {@link Productformfeature }
     * {@link B214 }
     * {@link B211 }
     * {@link B012 }
     * {@link B385 }
     * {@link B004 }
     * {@link B215 }
     * {@link B005 }
     * {@link H208 }
     * {@link B333 }
     * {@link B210 }
     * {@link B225 }
     * {@link B014 }
     * {@link B216 }
     * {@link Publisher }
     * {@link B013 }
     * {@link Website }
     * {@link B212 }
     * {@link B277 }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
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
            return "RelatedProduct";
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
            return "relatedproduct";
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
