//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 10:20:45 PM IST 
//


package gov.nist.scap.schema.scap_core._0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nist.scap.schema.scap_core._0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchableCpeReferencesTypeCpeName_QNAME = new QName("http://scap.nist.gov/schema/scap-core/0.1", "cpe-name");
    private final static QName _SearchableCpeReferencesTypeCpeSearchableName_QNAME = new QName("http://scap.nist.gov/schema/scap-core/0.1", "cpe-searchable-name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nist.scap.schema.scap_core._0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link CheckSearchType }
     * 
     */
    public CheckSearchType createCheckSearchType() {
        return new CheckSearchType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link SearchableCpeReferencesType }
     * 
     */
    public SearchableCpeReferencesType createSearchableCpeReferencesType() {
        return new SearchableCpeReferencesType();
    }

    /**
     * Create an instance of {@link CheckReferenceType }
     * 
     */
    public CheckReferenceType createCheckReferenceType() {
        return new CheckReferenceType();
    }

    /**
     * Create an instance of {@link NotesType }
     * 
     */
    public NotesType createNotesType() {
        return new NotesType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://scap.nist.gov/schema/scap-core/0.1", name = "cpe-name", scope = SearchableCpeReferencesType.class)
    public JAXBElement<String> createSearchableCpeReferencesTypeCpeName(String value) {
        return new JAXBElement<String>(_SearchableCpeReferencesTypeCpeName_QNAME, String.class, SearchableCpeReferencesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://scap.nist.gov/schema/scap-core/0.1", name = "cpe-searchable-name", scope = SearchableCpeReferencesType.class)
    public JAXBElement<String> createSearchableCpeReferencesTypeCpeSearchableName(String value) {
        return new JAXBElement<String>(_SearchableCpeReferencesTypeCpeSearchableName_QNAME, String.class, SearchableCpeReferencesType.class, value);
    }

}
