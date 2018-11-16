package factories;

import dao.IPessoaDAO;
import jdbc.JDBCPessoaDAO;

public class PessoaFactory {

    public static IPessoaDAO    criaInstancia(){
        return new JDBCPessoaDAO();
    }

}
