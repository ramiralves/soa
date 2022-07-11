package br.com.ufrj.engsoft.soa.restful.autor.model.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long 	id;	
	private int 	cep;
	private String 	logradouro;
	private int 	numero;
	private String 	complemento;
	
    @OneToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "autor_id", insertable = true)
    private Autor autor;
    
    @OneToOne(mappedBy = "endereco", cascade = {CascadeType.PERSIST}, fetch = FetchType.EAGER , optional = false)
    private Pais pais;

    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL, fetch = FetchType.EAGER , optional = false)    
    private Cidade cidade;
    
    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL, fetch = FetchType.EAGER , optional = false)    
    private Estado estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}	
	

	
	
}
