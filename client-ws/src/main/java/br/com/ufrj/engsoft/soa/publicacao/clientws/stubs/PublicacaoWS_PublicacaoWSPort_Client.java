
package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.13
 * 2022-06-29T20:15:33.475-03:00
 * Generated source version: 3.3.13
 *
 */
public final class PublicacaoWS_PublicacaoWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "PublicacaoWsService");

    private PublicacaoWS_PublicacaoWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PublicacaoWsService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        PublicacaoWsService ss = new PublicacaoWsService(wsdlURL, SERVICE_NAME);
        PublicacaoWS port = ss.getPublicacaoWSPort();

        {
        System.out.println("Invoking obterPublicacoesContemTitulo...");
        java.lang.String _obterPublicacoesContemTitulo_titulo = "";
        try {
            br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.PublicacaoResponse _obterPublicacoesContemTitulo__return = port.obterPublicacoesContemTitulo(_obterPublicacoesContemTitulo_titulo);
            System.out.println("obterPublicacoesContemTitulo.result=" + _obterPublicacoesContemTitulo__return);

        } catch (ParametroException_Exception e) {
            System.out.println("Expected exception: ParametroException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
