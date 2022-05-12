import entities.UsuarioJogo;

public class Programa {
    public static void main(String[] args) {
        UsuarioJogo user1 = new UsuarioJogo();
        user1.UsuarioJogo("Renan Augusto", "devrsantos");
        UsuarioJogo user2 = new UsuarioJogo();
        user2.UsuarioJogo("Allyssa", "Amor Verdadeiro");
        user1.aumentarPontuacao();
        user2.bonus(15);
        user2.subirNivel();
        user2.subirNivel();
        user2.subirNivel();
        System.out.println(user2);
    }
}
