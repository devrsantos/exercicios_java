package entities;

import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;

    private boolean temPapel(){
        if (folhasDisponiveis > 0){
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(String texto){
        if (this.temPapel()) {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Tipo de Conexão Estabelecida: " + this.tipoConexao);
            System.out.println("Impressora Fabricada em : " + this.dataFabricacao);
            System.out.println("O seguinte documento está sendo impresso: " + texto);
        } else {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Tipo de Conexão Estabelecida: " + this.tipoConexao);
            System.out.println("Impressora Fabricada em : " + this.dataFabricacao);
            System.out.println("Por Favor, adicione papel a impressora");
        };
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    @Override
    public String toString() {
        return "Impressora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", folhasDisponiveis=" + folhasDisponiveis +
                '}';
    }
}
