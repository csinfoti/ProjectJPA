package model;

public class Endereco {
	
	private Integer id_endereco;
	private String rua;
	private int numero;
	private String complemento;
	
	
	public Integer getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(Integer id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
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
	public Endereco(int id_endereco, String rua, int numero, String complemento) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Endereco [id_endereco=" + id_endereco + ", rua=" + rua + ", numero=" + numero + ", complemento="
				+ complemento + ", getId_endereco()=" + getId_endereco() + ", getRua()=" + getRua() + ", getNumero()="
				+ getNumero() + ", getComplemento()=" + getComplemento() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
