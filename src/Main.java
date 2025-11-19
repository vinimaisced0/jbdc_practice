public class Main {
    public static void main(String[] args) {

        Usuarios novoUsuario = new Usuarios();
        novoUsuario.setNome("Vini");
        novoUsuario.setLogin("vinimaiscedo");
        novoUsuario.setSenha("123");
        novoUsuario.setEmail("vinimaiscedo08@gmail.com");

        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrarUsuario(novoUsuario);
    }
}
