package fase_5.atividade_7;

/**
 * @author Fernando - RA 142016-1
 * FATEC ZL 4º ADS - Noite
 * FASE 05: Atividade 7 (Padrão de Projeto Mediator)
 * Classe Colleague que representam as plataforma Android.
 */

public class AndroidColleague extends Colleague {
 
    public AndroidColleague(Mediator m) {
        super(m);
    }
 
    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Android recebeu: " + mensagem);
    }
}
