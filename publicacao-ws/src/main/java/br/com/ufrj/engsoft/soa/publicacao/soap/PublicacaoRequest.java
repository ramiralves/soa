package br.com.ufrj.engsoft.soa.publicacao.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PublicacaoRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PublicacaoRequest {

	@XmlElement(name = "autor", required = true)
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    


}
