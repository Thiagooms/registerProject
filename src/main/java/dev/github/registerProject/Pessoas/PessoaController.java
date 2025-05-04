package dev.github.registerProject.Pessoas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar Pessoa (CREATE)

    @PostMapping("/criar")
    public String criarPessoa() {
        return "Pessoa Cadastrada no Sistema!";
    }

    //Mostrar Todas as Pessoas por ID (CREATE)

    @GetMapping("/listar")
    public List<PessoaModel> listarPessoas(){
        return pessoaService.listarPessoas();
    }

    //Mostrar Pessoas por ID (READ)

    //localhost:8080/pessoas/listar/1 <- id
    @GetMapping("/listar/{id}")
    public PessoaModel listarPessoasPorId(@PathVariable Long id) {
        return pessoaService.listarPessoasPorID(id);
    }

    //Alterar Dados de uma Pessoa (UPDATE)

    @PutMapping("/alterarID")
    public String alterarPessoaPorId(){
        return "Alterar Pessoa por ID";
    }

    //Deletar Pessoa (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPessoaPorId(){
        return "Pessoa Deletada por ID";
    }


}
