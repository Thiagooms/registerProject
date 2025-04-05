package dev.github.registerProject.Tarefas;

import dev.github.registerProject.Pessoas.PessoaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeTarefa;
    private String status;

    //Uma tarefa pode ser dada a várias pessoas. - @ManyToOne
    @ManyToOne
    @JoinColumn(name = "tarefas_id") //Foreing Key OU Chave estrangeira.
    private PessoaModel pessoa;

    public TarefasModel() {

    }

    public TarefasModel(Long id, String nomeTarefa, String status) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
