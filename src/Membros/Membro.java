package Membros;

public abstract class Membro implements PostarMensagem{
    /*
    Variaveis Nome, Email e TipoDeMembro variam por usuário.
     */
    private String Nome;
    private String Email;
    private TiposDeMembros TipoDeMembro;

    /*
    Variaveis AssinaturaNormal e AssinaturaExtras variam por TipoDeMembro.
     */
    private String AssinaturaNormal;
    private String AssinaturaExtras;

    /*
    Construtor Que Inicia As Variaveis Nome, Email e TipoDeMembro.
     */
    public Membro(String Nome,String Email,TiposDeMembros TipoDeMembro) {
        this.Nome = Nome;
        this.Email = Email;
        this.TipoDeMembro = TipoDeMembro;
    }

    /*
    Função Recebe Uma Mensagem, Adiciona Assinatura e Usa Uma Instancia Da Classe Sistema Para Postar A Mensagem Para Todos.
     */
    public void PostarMensagem(Sistema Sis,String Mensagem) {
        Mensagem += AssinaturaAUsar(Sis);

        Sis.PostarMensagem(Mensagem);
    }

    /*
    Função Checa Qual É O Tipo De Horário Do Sistema E Escolhe Qual Assinatura Deve Ser Usada.
     */
    private String AssinaturaAUsar(Sistema Sis) {
        if(Sis.TipoDeHorario == TiposDeHorario.Normal) {
            return AssinaturaNormal;
        } else {
            return AssinaturaExtras;
        }
    }
}
