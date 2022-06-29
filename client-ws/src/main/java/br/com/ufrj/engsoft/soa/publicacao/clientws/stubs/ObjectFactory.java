
package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ufrj.engsoft.soa.publicacao.clientws.stubs package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _ObterPublicacoesContemTitulo_QNAME = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "obterPublicacoesContemTitulo");
    private final static QName _ObterPublicacoesContemTituloResponse_QNAME = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "obterPublicacoesContemTituloResponse");
    private final static QName _ParametroException_QNAME = new QName("http://soap.publicacao.soa.engsoft.ufrj.com.br/", "ParametroException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ufrj.engsoft.soa.publicacao.clientws.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterPublicacoesContemTitulo }
     * 
     */
    public ObterPublicacoesContemTitulo createObterPublicacoesContemTitulo() {
        return new ObterPublicacoesContemTitulo();
    }

    /**
     * Create an instance of {@link ObterPublicacoesContemTituloResponse }
     * 
     */
    public ObterPublicacoesContemTituloResponse createObterPublicacoesContemTituloResponse() {
        return new ObterPublicacoesContemTituloResponse();
    }

    /**
     * Create an instance of {@link ParametroException }
     * 
     */
    public ParametroException createParametroException() {
        return new ParametroException();
    }

    /**
     * Create an instance of {@link PublicacaoResponse }
     * 
     */
    public PublicacaoResponse createPublicacaoResponse() {
        return new PublicacaoResponse();
    }

    /**
     * Create an instance of {@link Publicacao }
     * 
     */
    public Publicacao createPublicacao() {
        return new Publicacao();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterPublicacoesContemTitulo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterPublicacoesContemTitulo }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", name = "obterPublicacoesContemTitulo")
    public JAXBElement<ObterPublicacoesContemTitulo> createObterPublicacoesContemTitulo(ObterPublicacoesContemTitulo value) {
        return new JAXBElement<ObterPublicacoesContemTitulo>(_ObterPublicacoesContemTitulo_QNAME, ObterPublicacoesContemTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterPublicacoesContemTituloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObterPublicacoesContemTituloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", name = "obterPublicacoesContemTituloResponse")
    public JAXBElement<ObterPublicacoesContemTituloResponse> createObterPublicacoesContemTituloResponse(ObterPublicacoesContemTituloResponse value) {
        return new JAXBElement<ObterPublicacoesContemTituloResponse>(_ObterPublicacoesContemTituloResponse_QNAME, ObterPublicacoesContemTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametroException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParametroException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", name = "ParametroException")
    public JAXBElement<ParametroException> createParametroException(ParametroException value) {
        return new JAXBElement<ParametroException>(_ParametroException_QNAME, ParametroException.class, null, value);
    }

}
