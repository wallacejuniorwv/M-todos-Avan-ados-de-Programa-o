import dao.IPessoaDAO;
import factories.PessoaFactory;
import models.Pessoa;

public class Projeto {

    public static void main(String[] args){

        IPessoaDAO pessoaDAO = PessoaFactory.criaInstancia();


        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setCpf("40140727892");
        pessoa.setIdade(19);

        try {
            pessoaDAO.add(pessoa);
        } catch (Exception ex){

        }
    }

}
