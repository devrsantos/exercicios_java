package entities;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public void UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao(){
        this.pontuacao += 1;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(int valor) {
        this.pontuacao = valor;
    }

    @Override
    public String toString() {
        return "UsuarioJogo{" +
                "nome='" + nome + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pontuacao=" + pontuacao +
                ", nivel=" + nivel +
                '}';
    }
}
