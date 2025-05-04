package dev.github.registerProject.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;


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

}
