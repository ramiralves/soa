package br.com.ufrj.engsoft.soa.restful.autor.model.dto;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "autor")
public class Autor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  @Column(unique = true, nullable = false)
  private String username;  
   
  @Column(unique = true, nullable = false)
  private String cpf;
 
  @Column(unique = true, nullable = false)
  private String nome;

  @Column(unique = true, nullable = false)
  private Date data_nascimento;

  @OneToOne(mappedBy = "autor", cascade = CascadeType.ALL,
          fetch = FetchType.EAGER, optional = false)
  private Endereco endereco = new Endereco();

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
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

public Date getData_nascimento() {
	return data_nascimento;
}

public void setData_nascimento(Date data_nascimento) {
	this.data_nascimento = data_nascimento;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

 
  
}
