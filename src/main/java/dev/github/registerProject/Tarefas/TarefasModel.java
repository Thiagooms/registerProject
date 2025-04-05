package dev.github.registerProject.Tarefas;

import dev.github.registerProject.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
