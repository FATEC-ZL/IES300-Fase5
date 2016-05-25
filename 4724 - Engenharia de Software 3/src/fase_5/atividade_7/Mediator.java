package fase_5.atividade_7;

/**
 * @author Fernando - RA 142016-1
 * FATEC ZL 4º ADS - Noite
 * FASE 05: Atividade 7 (Padrão de Projeto Mediator)
 * Define a interface comum de qualquer Mediator.
 */

public interface Mediator {
	
	void enviar(String mensagem, Colleague colleague);
}