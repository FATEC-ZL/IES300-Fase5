package fase_5.atividade_7;

/**
 * @author Fernando - RA 142016-1
 * FATEC ZL 4º ADS - Noite
 * FASE 05: Atividade 7 (Padrão de Projeto Mediator)
 * Mediator concreto deverá definir uma maneira de enviar mensagens.
 */

import java.util.ArrayList;

public class MensagemMediator implements Mediator {
 
    protected ArrayList<Colleague> contatos;
 
    public MensagemMediator() {
    	//O Mediator possui uma lista de objetos Colleague que 
    	//realizarão a comunicação e um método para adicionar um novo Colleague.
        contatos = new ArrayList<Colleague>();
    }
 
    public void adicionarColleague(Colleague colleague) {
        contatos.add(colleague);
    }
 
    
    //percorre toda a lista de contatos e envia mensagens.
    //Note que dentro deste métodos foi feita uma comparação 
    //para evitar a mensagem seja enviada para a pessoa que enviou.
    //Para enviar a mensagem primeiro deve ser definido qual protocolo 
    //utilizar e em seguida enviar a mensagem.
    
    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }
    
    //apenas imprime na tela o tipo do Colleague que 
    //enviou a mensagem, utilizar para isso a verificação instanceof.  
    
    private void definirProtocolo(Colleague contato) {
        if (contato instanceof IOSColleague) {
            System.out.println("Protocolo iOS");
        } else if (contato instanceof AndroidColleague) {
            System.out.println("Protocolo Android");
        } else if (contato instanceof SymbianColleague) {
            System.out.println("Protocolo Symbian");
        }
    }
    
    public static void main(String[] args) {
        MensagemMediator mediador = new MensagemMediator();
     
        AndroidColleague android = new AndroidColleague(mediador);
        IOSColleague ios = new IOSColleague(mediador);
        SymbianColleague symbian = new SymbianColleague(mediador);
     
        mediador.adicionarColleague(android);
        mediador.adicionarColleague(ios);
        mediador.adicionarColleague(symbian);
         
        symbian.enviarMensagem("Oi, eu sou um Symbian!");
        System.out.println("=========");
        
        android.enviarMensagem("Oi Symbian! Eu sou um Android!");
        System.out.println("=========");
        
        ios.enviarMensagem("Olá todos, sou um iOs!");
    }
 
}