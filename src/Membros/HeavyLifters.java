package Membros;

public class HeavyLifters extends Membro {
    /*
    Variaveis Especificas Da Classe Filha HeavyLifters.
     */
    private String AssinaturaNormal = "Podem contar conosco!";
    private String AssinaturaExtras = "N00b_qu3_n_Se_r3pita.bat";

    /*
    Constructor Com Super Da Classe Mãe.
     */
    public HeavyLifters(String Nome, String Email, TiposDeMembros TipoDeMembro) {
        super(Nome, Email, TipoDeMembro);
    }

    public void PostarMensagem() {

    }
}
