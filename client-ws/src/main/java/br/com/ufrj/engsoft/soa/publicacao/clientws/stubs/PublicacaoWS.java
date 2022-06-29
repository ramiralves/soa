package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.13
 * 2022-06-29T18:30:57.044-03:00
 * Generated source version: 3.3.13
 *
 */
@WebService(targetNamespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", name = "PublicacaoWS")
@XmlSeeAlso({ObjectFactory.class})
public interface PublicacaoWS {

    @WebMethod
    @RequestWrapper(localName = "obterPublicacoesContemTitulo", targetNamespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", className = "br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ObterPublicacoesContemTitulo")
    @ResponseWrapper(localName = "obterPublicacoesContemTituloResponse", targetNamespace = "http://soap.publicacao.soa.engsoft.ufrj.com.br/", className = "br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ObterPublicacoesContemTituloResponse")
    @WebResult(name = "publicacoes", targetNamespace = "")
    public br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.PublicacaoResponse obterPublicacoesContemTitulo(

        @WebParam(name = "titulo", targetNamespace = "")
        java.lang.String titulo
    ) throws ParametroException_Exception;
}
