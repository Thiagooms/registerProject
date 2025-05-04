package dev.github.registerProject.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TarefasService {

    private TarefasRepository tarefasRepository;

    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    public List<TarefasModel> listarTarefas() {
        return tarefasRepository.findAll();
    }

}
