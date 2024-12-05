package tratamento;

import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class LancarExcecaoCartaoNaoReconhecido  {

	public void lancarExcecao(String cartao) {

		throw new IllegalArgumentException("Não foi possível identificar a bandeira do cartão com número " + cartao);

	}

}
