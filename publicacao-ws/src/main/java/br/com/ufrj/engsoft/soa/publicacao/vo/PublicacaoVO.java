package br.com.ufrj.engsoft.soa.publicacao.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;


@Entity
@Table(name="publicacao")
@XmlType(name = "publicacao")
public class PublicacaoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id	
	private int id;
	private String titulo;
	
	@Column(name = "pagina_inicial")
	private int paginaInicial;
	
	@Column(name = "pagina_final")
	private int paginaFinal;
	
	@Column(name = "ano_publicao")
	private int anoPublicao;
	
    
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="autor_publicacao",
	             joinColumns={@JoinColumn(name="autor_id")},
	             inverseJoinColumns={@JoinColumn(name="publicao_id")})
	private List<AutorVO> autores = new ArrayList<AutorVO>();

	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginaInicial() {
		return paginaInicial;
	}
	public void setPaginaInicial(int paginaInicial) {
		this.paginaInicial = paginaInicial;
	}
	public int getPaginaFinal() {
		return paginaFinal;
	}
	public void setPaginaFinal(int paginaFinal) {
		this.paginaFinal = paginaFinal;
	}
	public int getAnoPublicao() {
		return anoPublicao;
	}
	public void setAnoPublicao(int anoPublicao) {
		this.anoPublicao = anoPublicao;
	}
	public List<AutorVO> getAutores() {
		return autores;
	}
	public void setAutores(List<AutorVO> autores) {
		this.autores = autores;
	}
	
}
