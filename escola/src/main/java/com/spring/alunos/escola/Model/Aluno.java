package com.spring.alunos.escola.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @Column(name = "id_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double nota1;
    private double nota2;
    private String disciplina;

    public double getMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String getStatus() {
        return getMedia() >= 6.0 ? "Aprovado" : "Reprovado";
    }
}
