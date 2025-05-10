package dev.github.registerProject.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TarefasService {

    //Injeção de dependência
    private TarefasRepository tarefasRepository;

    //Construtor
    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    //Lógica de negócio
    public List<TarefasModel> listarTarefas() {
        return tarefasRepository.findAll();
    }

    //Listar tarefa por ID
    public TarefasModel listarTarefaPorId(Long id) {
        Optional<TarefasModel> tarefaPorId = tarefasRepository.findById(id);
        return tarefaPorId.orElse(null);
    }

    //Cadastrar Tarefas
    public TarefasModel cadastrarTarefa(TarefasModel tarefa) {
        return tarefasRepository.save(tarefa);
    }

    //Deletar por ID
    public void deletarTarefaPorId(Long id) {
        tarefasRepository.deleteById(id);
    }

}
