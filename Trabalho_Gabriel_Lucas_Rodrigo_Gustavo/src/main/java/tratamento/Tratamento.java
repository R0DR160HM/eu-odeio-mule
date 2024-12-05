package tratamento;

import java.util.Map;
import java.util.Random;

public class Tratamento {

	public Pedido tratarRequisicao(Map<String, String> params) {

		Pedido pedido = new Pedido();

		String quantidadeRoboDomesticoArk = params.get("QRDRA");
		String quantidadeRoboDomesticoSolar = params.get("QRDRS");

		String nome = params.get("nome");
		String cpf = params.get("cpf");
		String endereco = params.get("endereco");
		String bairro = params.get("bairro");
		String municipio = params.get("municipio");
		String estado = params.get("estado");
		String cep = params.get("cep");
		String email = params.get("email");
		String numeroCartao = params.get("numeroCartao");
		String telefone = params.get("telefone");
		String frete = params.get("frete");

		// Criando um numero randomico para o codigo do pedido (so para
		// testes...)
		pedido.setCodigo(1 + new Random().nextInt(100));

		pedido.setCliente(nome);
		pedido.setCpf(cpf);
		pedido.setEndereco(endereco);
		pedido.setBairro(bairro);
		pedido.setMunicipio(municipio);
		pedido.setEstado(estado);
		pedido.setCep(cep);
		pedido.setTelefone(telefone);
		pedido.setEmail(email);
		pedido.setNumeroCartao(numeroCartao);
		pedido.setFrete(frete);

		// tratamento dos itens
		// adiciona os itens
		// qRDAK - quantidade de robos(R) domesticos(D) reator ArK
		// qRDSL - quantidade de (R)obos (D)omesticos reator (S)o(L)ar

		int qReatorArk = 0;
		int qReatorSolar = 0;
		int qRoboDomestico = 0;

		int qRDAK = Integer.parseInt(quantidadeRoboDomesticoArk); // transforma
																	// para
																	// integer a
																	// string
																	// que tem a
																	// quantidade
																	// de robos
																	// pedidos

		int qRDSL = Integer.parseInt(quantidadeRoboDomesticoSolar);

		if (qRDAK > 0) {
			// se maior que um significa que existem pedidos para esse item ....
			// cada robo do tipo Robo Domestico com reatro Ark precisa de um
			// pedido para uma carcaca de robo e outro pedido para o reator
			// correspondente...

			qReatorArk = qRDAK;
			qRoboDomestico = qRDAK;
		}

		if (qRDSL > 0) {

			qRoboDomestico = qRoboDomestico + qRDSL;
			qReatorSolar = qRDSL;
		}

		// preencher beans com os itens

		pedido.setQtdRoboDomestico(qRoboDomestico);
		pedido.setQtdReatorArk(qReatorArk);
		pedido.setQtdReatorSolar(qReatorSolar);
		pedido.setqtdTotal(qRoboDomestico + qReatorArk + qReatorSolar);

		pedido.setTotal(100 + new Random().nextInt(1000)); // valor aleatorio s�
		// para constar...

		return pedido;
	}
}
