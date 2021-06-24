package Membros;

public class MobileMembers extends Membro {
    /*
    Variaveis Especificas Da Classe Filha MobileMembers.
     */
    private String AssinaturaNormal = "Happy Coding!";
    private String AssinaturaExtras = "Happy_C0d1ng. Maskers";

    /*
    Constructor Com Super Da Classe Mãe.
     */
    public MobileMembers(String Nome, String Email, TiposDeMembros TipoDeMembro) {
        super(Nome, Email, TipoDeMembro);
    }

    public void PostarMensagem() {

    }
}
