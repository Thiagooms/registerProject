package dev.github.registerProject.Tarefas;

//localhost:8080

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Aqui nós criamos um subdominio chamado "missoes" para acessar o nosso endpoint por esse subdominio e não dar conflito
//Com o nosso PessoaController endpoint "criar", agora ele vai ser acessado com o subdominio,
//localhost:8080/missoes/criar.
@RequestMapping("missoes")
public class TarefasController {

    //localhost:8080/missoes/criar
    @PostMapping("/criar")
    public String criarTarefa() {
        return "Missão criada com sucesso!";
    }


}
