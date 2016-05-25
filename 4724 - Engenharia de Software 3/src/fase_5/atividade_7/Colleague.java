package fase_5.atividade_7;

/**
 * @author Fernando - RA 142016-1
 * FATEC ZL 4º ADS - Noite
 * FASE 05: Atividade 7 (Padrão de Projeto Mediator)
 * Classe Colleague define como receber uma mensagem e enviar uma mensagem para um Mediator.
 */

public abstract class Colleague {
	
	protected Mediator mediator;
	 
    public Colleague(Mediator m) {
        mediator = m;
    }
 
    public void enviarMensagem(String mensagem) {
        mediator.enviar(mensagem, this);
    }
 
    public abstract void receberMensagem(String mensagem);
}