package dev.github.registerProject.Pessoas;

import dev.github.registerProject.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    //Aqui estamos falando que essa coluna é única, ou seja, cada usuario deve ter um
    //email único
    @Column(unique = true)
    private String email;
    private int idade;

    //Uma pessoa tem uma única tarefa, - @ManyToOne.
    /**
     * One Person can have many tasks is the essence of the @OneToMany annotation.
     *If You want a person to have a single task as per your comment, consider
     * using a @OneToOne mapping.
     */
    @OneToMany(mappedBy = "pessoa")
    private List<TarefasModel> tarefas;

}
