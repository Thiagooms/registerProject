package dev.github.registerProject.Pessoas;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    //Injeção de dependência, que é nada mais que, dar permissão ao service para ter acesso ao repository
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    // Listar todos as minhas pessoas
    public List<PessoaModel> listarPessoas() {
        return pessoaRepository.findAll();
        //Para mostrar todos os elementos utilizamos o findall, o save é equivalente ao insert, porque vamos salvar no
        //banco de dados, vamos salvar, findByID, para procurarmos elementos por ID.
    }


}
