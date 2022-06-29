package br.com.ufrj.engsoft.soa.publicacao.soap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import br.com.ufrj.engsoft.soa.publicacao.vo.PublicacaoVO;

@XmlType(name = "PublicacaoResponse")
public class PublicacaoResponse {
	
    private List<PublicacaoVO> publicacoes = new ArrayList<PublicacaoVO>();

	public List<PublicacaoVO> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<PublicacaoVO> publicacoes) {
		this.publicacoes = publicacoes;
	}
	
}
