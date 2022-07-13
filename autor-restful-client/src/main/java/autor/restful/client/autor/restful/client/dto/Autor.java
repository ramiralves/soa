package autor.restful.client.autor.restful.client.dto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Autor {

  private Integer id;

  private String username;  
  private String cpf;
  private String nome;
  private Date data_nascimento;
  private List<Endereco> endereco = new ArrayList<Endereco>();
  

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

public List<Endereco> getEndereco() {
	return endereco;
}

public void setEndereco(List<Endereco> endereco) {
	this.endereco = endereco;
}


 
  
}
