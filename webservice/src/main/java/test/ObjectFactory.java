
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test package. 
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

    private final static QName _QueryInvoiceInfoSoap_QNAME = new QName("", "QueryInvoiceInfoSoap");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryInvoiceInfoSoap }
     * 
     */
    public QueryInvoiceInfoSoap createQueryInvoiceInfoSoap() {
        return new QueryInvoiceInfoSoap();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link QueryInvoiceInfo }
     * 
     */
    public QueryInvoiceInfo createQueryInvoiceInfo() {
        return new QueryInvoiceInfo();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryInvoiceInfoSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QueryInvoiceInfoSoap")
    public JAXBElement<QueryInvoiceInfoSoap> createQueryInvoiceInfoSoap(QueryInvoiceInfoSoap value) {
        return new JAXBElement<QueryInvoiceInfoSoap>(_QueryInvoiceInfoSoap_QNAME, QueryInvoiceInfoSoap.class, null, value);
    }

}
