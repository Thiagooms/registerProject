package dev.github.registerProject.Tarefas;

//localhost:8080

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//Aqui nós criamos um subdominio chamado "tarefas" para acessar o nosso endpoint por esse subdominio e não dar conflito
//Com o nosso PessoaController endpoint "criar", agora ele vai ser acessado com o subdominio,
//localhost:8080/tarefas/criar.
@RequestMapping("/tarefas")
public class TarefasController {

    private TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    @GetMapping("/boasvindas")
        public String boasvindas(){
            return "Boas Vindas ao Tarefas Controller";
        }

    // GET -- Mandar uma requisição para mostrar tarefas
    @GetMapping("/listar")
        public List<TarefasModel> listarTarefas() {
            return tarefasService.listarTarefas();
    }

    // POST -- Mandar uma requisição para criar tarefas
    //localhost:8080/tarefas/criar
    @PostMapping("/criar")
        public String criarTarefa() {
            return "Tarefa criada com sucesso!";
    }

    // PUT -- Mandar uma requisição para alterar tarefas
    @PutMapping("/alterar")
        public String alterarTarefa() {
            return "Tarefa alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar tarefas
    @DeleteMapping("/deletar")
        public String deletarTarefa() {
            return "Tarefa deletada com sucesso";
    }

}
