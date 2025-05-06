package com.spring.alunos.escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.alunos.escola.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
