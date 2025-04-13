package dev.github.registerProject.Pessoas;

import dev.github.registerProject.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Transform a class into an entity and Create a Table.
//Issue #2 ok
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    //Aqui estamos falando que essa coluna é única, ou seja, cada usuario deve ter um
    //email único
    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    //ManyToOne - Uma pessoa tem uma única tarefa.
    @ManyToOne
    @JoinColumn(name = "tarefas_id") //Foreing Key ou Chave Estrangeira
    private TarefasModel tarefas;

}
