import entities.Impressora;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Impressora imp = new Impressora();
        imp.setModelo("HP DeskJet Ink Advantage 2774");
        imp.setTipoConexao("Wi-Fi");
        imp.setDataFabricacao(new Date());
        imp.setFolhasDisponiveis(5);
        imp.imprimir("Curriculo.docx");
    }
}
