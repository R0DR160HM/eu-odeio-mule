package tratamento;

import java.io.Serializable;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String cliente;
	private String email;
	private String cpf;
	private String endereco;
	private String bairro;
	private String municipio;

	private String estado;
	private String cep;
	private String telefone;

	private String numeroCartao;
	private String frete;
	private String totalPedido;

	private int qtdRoboDomestico;

	private int qtdReatorArk;

	private int qtdReatorSolar;

	private int qtdTotal;

	private float total;

	private String notaFiscal;

	private String urlNotaFiscal;

	private String numeroProcessado;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public String getUrlNotaFiscal() {
		return urlNotaFiscal;
	}

	public void setUrlNotaFiscal(String urlNotaFiscal) {
		this.urlNotaFiscal = urlNotaFiscal;
	}

	public int getQtdRoboDomestico() {
		return qtdRoboDomestico;
	}

	public void setQtdRoboDomestico(int qtdRoboDomestico) {
		this.qtdRoboDomestico = qtdRoboDomestico;
	}

	public int getQtdReatorArk() {
		return qtdReatorArk;
	}

	public void setQtdReatorArk(int qtdReatorArk) {
		this.qtdReatorArk = qtdReatorArk;
	}

	public int getQtdReatorSolar() {
		return qtdReatorSolar;
	}

	public void setQtdReatorSolar(int qtdReatorSolar) {
		this.qtdReatorSolar = qtdReatorSolar;
	}

	public int getQtdTotal() {
		return qtdTotal;
	}

	public void setqtdTotal(int qtdTotal) {
		this.qtdTotal = qtdTotal;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", cliente=" + cliente + ", email=" + email + ", cpf="
				+ cpf + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", municipio=" + municipio + ", estado=" + estado + ", cep="
				+ cep + ", telefone=" + telefone + ", numeroCartao=" + numeroCartao + ", qtdRoboDomestico="
				+ qtdRoboDomestico + ", qtdReatorArk=" + qtdReatorArk
				+ ", qtdReatorSolar=" + qtdReatorSolar + ", total=" + total
				+ ", notaFiscal=" + notaFiscal + ", urlNotaFiscal="
				+ urlNotaFiscal + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public String getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(String totalPedido) {
		this.totalPedido = totalPedido;
	}

	public String getNumeroProcessado() {
		return numeroProcessado;
	}

	public void setNumeroProcessado(String numeroProcessado) {
		this.numeroProcessado = numeroProcessado;
	}

}
