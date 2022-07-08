package br.com.fiap.banco02;

public class Cliente {

	private String nmCliente, cpfCliente, endereco, email;

	public Cliente(String nmCliente, String cpfCliente, String endereco, String email) {
		this.nmCliente = nmCliente;
		this.cpfCliente = cpfCliente;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}


