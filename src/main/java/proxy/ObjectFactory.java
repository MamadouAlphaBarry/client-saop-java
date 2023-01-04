
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Consulter_QNAME = new QName("http://sid.org/", "consulter");
    private final static QName _ConsulterResponse_QNAME = new QName("http://sid.org/", "consulterResponse");
    private final static QName _Operation_QNAME = new QName("http://sid.org/", "operation");
    private final static QName _Operations_QNAME = new QName("http://sid.org/", "operations");
    private final static QName _Releve_QNAME = new QName("http://sid.org/", "releve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consulter }
     * 
     * @return
     *     the new instance of {@link Consulter }
     */
    public Consulter createConsulter() {
        return new Consulter();
    }

    /**
     * Create an instance of {@link ConsulterResponse }
     * 
     * @return
     *     the new instance of {@link ConsulterResponse }
     */
    public ConsulterResponse createConsulterResponse() {
        return new ConsulterResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     * @return
     *     the new instance of {@link Operations }
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Consulter }{@code >}
     */
    @XmlElementDecl(namespace = "http://sid.org/", name = "consulter")
    public JAXBElement<Consulter> createConsulter(Consulter value) {
        return new JAXBElement<>(_Consulter_QNAME, Consulter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sid.org/", name = "consulterResponse")
    public JAXBElement<ConsulterResponse> createConsulterResponse(ConsulterResponse value) {
        return new JAXBElement<>(_ConsulterResponse_QNAME, ConsulterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     */
    @XmlElementDecl(namespace = "http://sid.org/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}
     */
    @XmlElementDecl(namespace = "http://sid.org/", name = "operations")
    public JAXBElement<Operations> createOperations(Operations value) {
        return new JAXBElement<>(_Operations_QNAME, Operations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://sid.org/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

}
