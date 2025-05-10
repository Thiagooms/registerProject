package dev.github.registerProject.Pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar Pessoa (CREATE)

    @PostMapping("/cadastrar")
    public PessoaModel cadastrarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.cadastrarPessoa(pessoaModel);
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

    @PutMapping("/alterar/{id}")
    public PessoaModel alterarPessoaPorId(@PathVariable Long id, @RequestBody PessoaModel pessoaAtualizado){
        return pessoaService.atualizarPessoa(id, pessoaAtualizado);
    }

    //Deletar Pessoa (DELETE)
    @DeleteMapping("/deletar/{id}")
        public void deletarPessoaPorId(@PathVariable Long id){
        pessoaService.deletarPessoaPorId(id);
    }


}
