package com.spring.alunos.escola.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.alunos.escola.Model.Aluno;
import com.spring.alunos.escola.Repository.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired 
    private AlunoRepository alunoRepository;

    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    public List<Aluno> listarAluno() {
        return alunoRepository.findAll();
    }
    public Optional<Aluno> buncarAlunoPorId(Long Id) {
        return alunoRepository.findById(Id);
    }
    public List<String> calcularStatusDeTodos() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos.stream().map(aluno -> aluno.getNome() + " - " + aluno.getStatus())
        .toList();
                            
    }
}
