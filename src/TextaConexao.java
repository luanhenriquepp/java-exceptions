public class TextaConexao {
    public static void main(String[] args) {

        try (Conexao con = new Conexao()) {
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro!!");
        }
    }
}
