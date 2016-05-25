package fase_5.atividade_7;

/**
 * @author Fernando - RA 142016-1
 * FATEC ZL 4º ADS - Noite
 * FASE 05: Atividade 7 (Padrão de Projeto Mediator)
 * Classe Colleague que representam as plataforma Symbian.
 */

public class SymbianColleague extends Colleague {
 
    public SymbianColleague(Mediator m) {
        super(m);
    }
 
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Symbian recebeu: " + mensagem);
    }
}