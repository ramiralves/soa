package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.13
 * 2022-07-01T18:09:50.196-03:00
 * Generated source version: 3.3.13
 *
 */
@WebServiceClient(name = "PublicacaoWsService",
                  wsdlLocation = "file:/C:/Users/RAMIR~1.MEL/AppData/Local/Temp/tempdir18055283750016312739.tmp/PublicacaoWS_1.wsdl",
                  targetNamespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/")
public class PublicacaoWsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "PublicacaoWsService");
    public final static QName PublicacaoWSPort = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "PublicacaoWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/RAMIR~1.MEL/AppData/Local/Temp/tempdir18055283750016312739.tmp/PublicacaoWS_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PublicacaoWsService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/RAMIR~1.MEL/AppData/Local/Temp/tempdir18055283750016312739.tmp/PublicacaoWS_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PublicacaoWsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PublicacaoWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicacaoWsService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PublicacaoWsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PublicacaoWsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PublicacaoWsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PublicacaoWS
     */
    @WebEndpoint(name = "PublicacaoWSPort")
    public PublicacaoWS getPublicacaoWSPort() {
        return super.getPort(PublicacaoWSPort, PublicacaoWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublicacaoWS
     */
    @WebEndpoint(name = "PublicacaoWSPort")
    public PublicacaoWS getPublicacaoWSPort(WebServiceFeature... features) {
        return super.getPort(PublicacaoWSPort, PublicacaoWS.class, features);
    }

}
