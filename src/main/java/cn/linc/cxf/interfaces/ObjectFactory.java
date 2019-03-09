
package cn.linc.cxf.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.linc.cxf.interfaces package. 
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

    private final static QName _FingCarsByUserResponse_QNAME = new QName("http://interfaces.cxf.linc.cn/", "fingCarsByUserResponse");
    private final static QName _FingCarsByUser_QNAME = new QName("http://interfaces.cxf.linc.cn/", "fingCarsByUser");
    private final static QName _SayHello_QNAME = new QName("http://interfaces.cxf.linc.cn/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://interfaces.cxf.linc.cn/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.linc.cxf.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FingCarsByUserResponse }
     * 
     */
    public FingCarsByUserResponse createFingCarsByUserResponse() {
        return new FingCarsByUserResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link FingCarsByUser }
     * 
     */
    public FingCarsByUser createFingCarsByUser() {
        return new FingCarsByUser();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingCarsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cxf.linc.cn/", name = "fingCarsByUserResponse")
    public JAXBElement<FingCarsByUserResponse> createFingCarsByUserResponse(FingCarsByUserResponse value) {
        return new JAXBElement<FingCarsByUserResponse>(_FingCarsByUserResponse_QNAME, FingCarsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingCarsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cxf.linc.cn/", name = "fingCarsByUser")
    public JAXBElement<FingCarsByUser> createFingCarsByUser(FingCarsByUser value) {
        return new JAXBElement<FingCarsByUser>(_FingCarsByUser_QNAME, FingCarsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cxf.linc.cn/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cxf.linc.cn/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
