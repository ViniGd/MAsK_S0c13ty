package Membros;

public class BigBrothers extends Membro {
    /*
    Variaveis Especificas Da Classe Filha BigBrothers.
     */
    private String AssinaturaNormal = "Sempre ajudando as pessoas membros ou não S2!";
    private String AssinaturaExtras = "...";

    /*
    Constructor Com Super Da Classe Mãe.
     */
    public BigBrothers(String Nome, String Email, TiposDeMembros TipoDeMembro) {
        super(Nome, Email, TipoDeMembro);
    }

    public void PostarMensagem() {

    }
    public void CadastrarMembro(Membro membro){

    }

}