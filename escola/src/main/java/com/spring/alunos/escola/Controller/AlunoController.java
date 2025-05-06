package com.spring.alunos.escola.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.spring.alunos.escola.Model.Aluno;
import com.spring.alunos.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping()
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno alunoSalvo = alunoService.salvarAluno(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> listarAlunos() {
        List<Aluno> alunos = alunoService.listarAluno();
        return ResponseEntity.ok(alunos);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoService.buncarAlunoPorId(id);
        return aluno.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    @GetMapping("/status")
    public ResponseEntity<List<String>> calcularStatusDeTodos() {
        List<String> status = alunoService.calcularStatusDeTodos();
        return ResponseEntity.ok(status);
    }
}
