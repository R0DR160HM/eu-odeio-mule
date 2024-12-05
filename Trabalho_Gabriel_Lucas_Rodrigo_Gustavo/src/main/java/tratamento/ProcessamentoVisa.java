package tratamento;

import java.util.Map;
import java.util.UUID;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;


public class ProcessamentoVisa implements Callable {
	
	@SuppressWarnings("unchecked")
	public Object onCall(MuleEventContext eventContext) throws Exception {
		Pedido pedido = (Pedido) eventContext.getMessage().getPayload();
		
		return processamento(pedido);
	    
	}

	public Pedido processamento(Pedido pedido) {

		pedido.setNumeroProcessado(pedido.getNumeroCartao()+UUID.randomUUID().toString());

		return pedido;
	}

}
