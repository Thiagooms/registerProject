package dev.github.registerProject.Pessoas;

import dev.github.registerProject.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Transform a class into an entity and Create a Table.
//Issue #2 ok
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Uma pessoa tem uma única tarefa, - @ManyToOne.
    @OneToMany(mappedBy = "pessoa")
    private TarefasModel tarefas;

}
