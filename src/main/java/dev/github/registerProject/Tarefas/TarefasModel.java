package dev.github.registerProject.Tarefas;

import dev.github.registerProject.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
