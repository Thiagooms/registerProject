package dev.github.registerProject.Pessoas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PessoaController {

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

    @GetMapping("/todos")
    public String mostrarTodosCadastrados(){
        return "Pessoa Cadastrada";
    }

    //Mostrar Pessoas por ID  (READ)

    @GetMapping("/todosID")
    public String mostrarTodosCadastradosPorId(){
        return "Pessoa Cadastrada por ID";
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
