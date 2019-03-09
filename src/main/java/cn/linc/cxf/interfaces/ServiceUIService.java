package cn.linc.cxf.interfaces;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2017-12-07T16:04:08.440+08:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "ServiceUIService", 
                  wsdlLocation = "http://127.0.0.1:8080/cxf-jax-ws-spring-server/services/serviceUi?wsdl",
                  targetNamespace = "http://interfaces.cxf.linc.cn/") 
public class ServiceUIService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://interfaces.cxf.linc.cn/", "ServiceUIService");
    public final static QName ServiceUIPort = new QName("http://interfaces.cxf.linc.cn/", "ServiceUIPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8080/cxf-jax-ws-spring-server/services/serviceUi?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceUIService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8080/cxf-jax-ws-spring-server/services/serviceUi?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceUIService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceUIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceUIService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceUIService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceUIService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServiceUIService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ServiceUI
     */
    @WebEndpoint(name = "ServiceUIPort")
    public ServiceUI getServiceUIPort() {
        return super.getPort(ServiceUIPort, ServiceUI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceUI
     */
    @WebEndpoint(name = "ServiceUIPort")
    public ServiceUI getServiceUIPort(WebServiceFeature... features) {
        return super.getPort(ServiceUIPort, ServiceUI.class, features);
    }

}