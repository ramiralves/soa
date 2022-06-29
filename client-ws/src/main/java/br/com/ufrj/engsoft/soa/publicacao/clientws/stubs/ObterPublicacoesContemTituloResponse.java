
package br.com.ufrj.engsoft.soa.publicacao.clientws.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de obterPublicacoesContemTituloResponse complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="obterPublicacoesContemTituloResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="publicacoes" type="{http://soap.publicacao.soa.engsoft.ufrj.com.br/}PublicacaoResponse" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterPublicacoesContemTituloResponse", propOrder = {
    "publicacoes"
})
public class ObterPublicacoesContemTituloResponse {

    protected PublicacaoResponse publicacoes;

    /**
     * Obtém o valor da propriedade publicacoes.
     * 
     * @return
     *     possible object is
     *     {@link PublicacaoResponse }
     *     
     */
    public PublicacaoResponse getPublicacoes() {
        return publicacoes;
    }

    /**
     * Define o valor da propriedade publicacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicacaoResponse }
     *     
     */
    public void setPublicacoes(PublicacaoResponse value) {
        this.publicacoes = value;
    }

}
