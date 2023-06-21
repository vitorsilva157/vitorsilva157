
import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        UsuarioDAO dao = new UsuarioDAO();

        Usuario u1 = new Usuario();
        u1.setId("001");
        u1.setNome("Vitor Silva");
        u1.setIdade("25");
        u1.setTelefone("(62) 9876-5432");
        u1.setSetor("Setor Gavarelo");
        u1.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u1);

        Usuario u2 = new Usuario();
        u2.setId("002");
        u2.setNome("Maria Santos");
        u2.setIdade("34");
        u2.setTelefone("(62) 9123-4567");
        u2.setSetor("Setor Bueno");
        u2.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u2);

        Usuario u3 = new Usuario();
        u3.setId("003");
        u3.setNome("Pedro Oliveira");
        u3.setIdade("42");
        u3.setTelefone("(62) 8765-4321");
        u3.setSetor("Setor Bueno");
        u3.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u3);

        Usuario u4 = new Usuario();
        u4.setId("004");
        u4.setNome("Ana Souza");
        u4.setIdade("29");
        u4.setTelefone("(62) 9012-3456");
        u4.setSetor("Setor Bueno");
        u4.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u4);

        Usuario u5 = new Usuario();
        u5.setId("005");
        u5.setNome("Carlos Almeida");
        u5.setIdade("38");
        u5.setTelefone("(62) 7654-3210");
        u5.setSetor("Setor Bueno");
        u5.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u5);

        Usuario u6 = new Usuario();
        u6.setId("006");
        u6.setNome("Laura Pereira");
        u6.setIdade("31");
        u6.setTelefone("(62) 8901-2345");
        u6.setSetor("Setor Bueno");
        u6.setVacinas("Johnson & Johnson: Janssen");
        dao.cadastrarUsuario(u6);

        Usuario u7 = new Usuario();
        u7.setId("007");
        u7.setNome("Lucas Costa");
        u7.setIdade("27");
        u7.setTelefone("(62) 6543-2109");
        u7.setSetor("Setor Oeste");
        u7.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u7);

        Usuario u8 = new Usuario();
        u8.setId("008");
        u8.setNome("Mariana Fernandes");
        u8.setIdade("36");
        u8.setTelefone("(62) 7890-1234");
        u8.setSetor("Setor Oeste");
        u8.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u8);

        Usuario u9 = new Usuario();
        u9.setId("009");
        u9.setNome("Gustavo Rodrigues");
        u9.setIdade("23");
        u9.setTelefone("(62) 5432-1098");
        u9.setSetor("Setor Oeste");
        u9.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u9);

        Usuario u10 = new Usuario();
        u10.setId("010");
        u10.setNome("Isabela Nunes");
        u10.setIdade("41");
        u10.setTelefone("(62) 6789-0123");
        u10.setSetor("Setor Oeste");
        u10.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u10);

        Usuario u11 = new Usuario();
        u11.setId("011");
        u11.setNome("Rafael Barbosa");
        u11.setIdade("32");
        u11.setTelefone("(62) 4321-0987");
        u11.setSetor("Setor Oeste");
        u11.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u11);

        Usuario u12 = new Usuario();
        u12.setId("012");
        u12.setNome("Larissa Andrade");
        u12.setIdade("28");
        u12.setTelefone("(62) 5678-9012");
        u12.setSetor("Setor Oeste");
        u12.setVacinas("Febre Amarela");
        dao.cadastrarUsuario(u12);

        Usuario u13 = new Usuario();
        u13.setId("013");
        u13.setNome("Fernando Cardoso");
        u13.setIdade("33");
        u13.setTelefone("(62) 3210-9876");
        u13.setSetor("Setor Sul");
        u13.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u13);

        Usuario u14 = new Usuario();
        u14.setId("014");
        u14.setNome("Amanda Gomes");
        u14.setIdade("39");
        u14.setTelefone("(62) 4567-8901");
        u14.setSetor("Setor Sul");
        u14.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u14);

        Usuario u15 = new Usuario();
        u15.setId("015");
        u15.setNome("Felipe Ribeiro");
        u15.setIdade("26");
        u15.setTelefone("(62) 2109-8765");
        u15.setSetor("Setor Sul");
        u15.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u15);

        Usuario u16 = new Usuario();
        u16.setId("016");
        u16.setNome("Camila Castro");
        u16.setIdade("37");
        u16.setTelefone("(62) 3456-7890");
        u16.setSetor("Setor Sul");
        u16.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u16);

        Usuario u17 = new Usuario();
        u17.setId("017");
        u17.setNome("Guilherme Pinto");
        u17.setIdade("24");
        u17.setTelefone("(62) 1098-5432");
        u17.setSetor("Setor Sul");
        u17.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u17);

        Usuario u18 = new Usuario();
        u18.setId("018");
        u18.setNome("Carolina Lima");
        u18.setIdade("35");
        u18.setTelefone("(62) 2345-6789");
        u18.setSetor("Setor Buriti Sereno");
        u18.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u18);

        Usuario u19 = new Usuario();
        u19.setId("019");
        u19.setNome("André Carvalho");
        u19.setIdade("30");
        u19.setTelefone("(62) 0987-4321");
        u19.setSetor("Setor Buriti Sereno");
        u19.setVacinas("Hepatite B");
        dao.cadastrarUsuario(u19);

        Usuario u20 = new Usuario();
        u20.setId("020");
        u20.setNome("Gabriela Torres");
        u20.setIdade("43");
        u20.setTelefone("(62) 9012-3456");
        u20.setSetor("Setor Buriti Sereno");
        u20.setVacinas("BCG");
        dao.cadastrarUsuario(u20);

        Usuario u21 = new Usuario();
        u21.setId("021");
        u21.setNome("Thiago Mendes");
        u21.setIdade("22");
        u21.setTelefone("(62) 8765-4321");
        u21.setSetor("Setor Buriti Sereno");
        u21.setVacinas("BCG");
        dao.cadastrarUsuario(u21);

        Usuario u22 = new Usuario();
        u22.setId("022");
        u22.setNome("Letícia Moreira");
        u22.setIdade("40");
        u22.setTelefone("(62) 8901-2345");
        u22.setSetor("Setor Buriti Sereno");
        u22.setVacinas("BCG");
        dao.cadastrarUsuario(u22);

        Usuario u23 = new Usuario();
        u23.setId("023");
        u23.setNome("Bruno Marques");
        u23.setIdade("29");
        u23.setTelefone("(62) 6543-2109");
        u23.setSetor("Setor Buriti Sereno");
        u23.setVacinas("BCG");
        dao.cadastrarUsuario(u23);

        Usuario u24 = new Usuario();
        u24.setId("024");
        u24.setNome("Natália Duarte");
        u24.setIdade("31");
        u24.setTelefone("(62) 7890-1234");
        u24.setSetor("Setor Marista");
        u24.setVacinas("BCG");
        dao.cadastrarUsuario(u24);

        Usuario u25 = new Usuario();
        u25.setId("025");
        u25.setNome("Renato Siqueira");
        u25.setIdade("38");
        u25.setTelefone("(62) 5432-1098");
        u25.setSetor("Setor Marista");
        u25.setVacinas("BCG");
        dao.cadastrarUsuario(u25);

        Usuario u26 = new Usuario();
        u26.setId("026");
        u26.setNome("Sofia Ferreira");
        u26.setIdade("27");
        u26.setTelefone("(62) 6789-0123");
        u26.setSetor("Setor Marista");
        u26.setVacinas("Não vacinou");
        dao.cadastrarUsuario(u26);

        Usuario u27 = new Usuario();
        u27.setId("027");
        u27.setNome("Henrique Freitas");
        u27.setIdade("34");
        u27.setTelefone("(62) 4321-0987");
        u27.setSetor("Setor Marista");
        u27.setVacinas("Não vacinou");
        dao.cadastrarUsuario(u27);

        Usuario u28 = new Usuario();
        u28.setId("028");
        u28.setNome("Beatriz Rocha");
        u28.setIdade("23");
        u28.setTelefone("(62) 5678-9012");
        u28.setSetor("Setor Marista");
        u28.setVacinas("Não vacinou");
        dao.cadastrarUsuario(u28);

        Usuario u29 = new Usuario();
        u29.setId("029");
        u29.setNome("Ricardo Gomes");
        u29.setIdade("33");
        u29.setTelefone("(62) 3210-9876");
        u29.setSetor("Setor Marista");
        u29.setVacinas("Não vacinou");
        dao.cadastrarUsuario(u29);

        Usuario u30 = new Usuario();
        u30.setId("030");
        u30.setNome("Aline Castro");
        u30.setIdade("39");
        u30.setTelefone("(62) 4567-8901");
        u30.setSetor("Setor Marista");
        u30.setVacinas("Não vacinou");
        dao.cadastrarUsuario(u30);
    }
}
