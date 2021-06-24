package Membros;

public class ScriptGuys extends Membro {
    /*
    Variaveis Especificas Da Classe Filha ScriptGuys.
     */
    private String AssinaturaNormal = "Prazer em ajudar novos amigos de código!";
    private String AssinaturaExtras = "QU3Ro_S3us_r3curs0s.py";

    /*
    Constructor Com Super Da Classe Mãe.
     */
    public ScriptGuys(String Nome, String Email, TiposDeMembros TipoDeMembro) {
        super(Nome, Email, TipoDeMembro);
    }

    public void PostarMensagem() {

    }
}
