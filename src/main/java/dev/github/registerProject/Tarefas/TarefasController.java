package dev.github.registerProject.Tarefas;

//localhost:8080

import org.springframework.web.bind.annotation.*;

@RestController

//Aqui nós criamos um subdominio chamado "missoes" para acessar o nosso endpoint por esse subdominio e não dar conflito
//Com o nosso PessoaController endpoint "criar", agora ele vai ser acessado com o subdominio,
//localhost:8080/missoes/criar.
@RequestMapping("missoes")
public class TarefasController {

    // GET -- Mandar uma requisição para mostrar missões
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso";
    }

    // POST -- Mandar uma requisição para criar missões
    //localhost:8080/missoes/criar
    @PostMapping("/criar")
    public String criarTarefa() {
        return "Missão criada com sucesso!";
    }

    // PUT -- Mandar uma requisição para alterar missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }

}
