package tratamento;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class MontaXmlNotaFiscal implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// System.out.println(eventContext.getMessage().getPayload());
		// Extract Pedido from the event payload
		Pedido pedido = (Pedido) eventContext.getMessage().getPayload();
		return montaXmlNotaFiscal(pedido);
	}

	public String montaXmlNotaFiscal(Pedido pedido) {

		StringBuilder xml = new StringBuilder();

		xml.append("<notaFiscal>");
		xml.append("<nomeCliente>" + pedido.getCliente() + "</nomeCliente>");
		xml.append("<cpfCnpjCliente>" + pedido.getCpf() + "</cpfCnpjCliente>");
		xml.append("<enderecoCliente>" + pedido.getEndereco()
				+ "</enderecoCliente>");
		xml.append("<bairroCliente>" + pedido.getBairro() + "</bairroCliente>");
		xml.append("<cepCliente>" + pedido.getCep() + "</cepCliente>");
		xml.append("<municipioCliente>" + pedido.getMunicipio()
				+ "</municipioCliente>");
		xml.append("<telefoneCliente>" + pedido.getTelefone()
				+ "</telefoneCliente>");
		xml.append("<ufCliente>" + pedido.getEstado() + "</ufCliente>");
		xml.append("<valorFrete>" + pedido.getFrete() + "</valorFrete>");

		xml.append("<itens>");

		if (pedido.getQtdRoboDomestico() > 0)
			if (pedido.getQtdReatorArk() > 0)
				addItemNF(xml, "STK001", "Reator ARK", 100,
						pedido.getQtdReatorArk());

		if (pedido.getQtdReatorSolar() > 0)
			addItemNF(xml, "STK002", "Reator Solar", 120,
					pedido.getQtdReatorSolar());

		xml.append("</itens>");
		xml.append("<informacoesAdicionais>Produto comprado pelo site</informacoesAdicionais>");
		xml.append("</notaFiscal>");

		return xml.toString();
	}

	private void addItemNF(StringBuilder xml, String codigo, String nome,
			float valorUnitario, int quantidade) {

		float valorTotal = valorUnitario * quantidade;

		// String codigo = p.contains("Ark") ? "STK001" : p.contains("Solar") ?
		// "STK002" : p.contains("Domestico") ? "BR001" : "-";

		xml.append("<itemNotaFiscal>");
		xml.append("<codigo>" + codigo + "</codigo>");
		xml.append("<descricao>" + nome + "</descricao>");
		xml.append("<unidade>PC</unidade>");
		xml.append("<quantidade>" + quantidade + "</quantidade>");
		xml.append("<valorUnitario>" + valorUnitario + "</valorUnitario>");
		xml.append("<valorTotal>" + valorTotal + "</valorTotal>");
		xml.append("</itemNotaFiscal>");
	}
}
