package br.com.ufrj.engsoft.soa.publicacao.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "autor")
@Entity
@Table(name="autor")
public class AutorVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public AutorVO() {
		
	}
		
	public AutorVO(String nome) {
		super();
		this.nome = nome;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id; 
	private String cpf; 
	private String nome;	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
