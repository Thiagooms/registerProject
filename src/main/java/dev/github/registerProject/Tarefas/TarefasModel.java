package dev.github.registerProject.Tarefas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.github.registerProject.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "pessoa_id") //Nossa Foreign Key da tabela tarefas
    @JsonIgnore
    private PessoaModel pessoa;
}
