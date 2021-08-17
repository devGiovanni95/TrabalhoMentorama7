package br.com.sistema.hospitalar.controller;

import br.com.sistema.hospitalar.entities.ProfissionalSaudeEntity;
import br.com.sistema.hospitalar.repositories.ProfissionalSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/profissionalSaude")
public class ProfissionalSaudeController {


    @Autowired
    private ProfissionalSaudeRepository profissionalSaudeRepository;

    @GetMapping
    public ResponseEntity<List<ProfissionalSaudeEntity>> findAll() {
        List<ProfissionalSaudeEntity> lista = profissionalSaudeRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public ProfissionalSaudeEntity findyById(@PathVariable("id") final Long id) {
        return this.profissionalSaudeRepository.findById(id).orElse(null);
    }

    @GetMapping("/contagem")
    public ProfissionalSaudeEntity findByNumberMedicByDepartament( ProfissionalSaudeEntity departamento) {
        return findByNumberMedicByDepartament(departamento);

    }
//    @GetMapping("/{contagem}")
//    public ProfissionalSaudeEntity findByNumberMedicByDepartament(@PathVariable("contagem") ProfissionalSaudeEntity departamento) {
//        return findByNumberMedicByDepartament(departamento);
//
//    }
//
//    @GetMapping("/{quantidadePorDepartamento}")
//    public Object findByNumberMedicByDepartament(@PathVariable("quantidadePorDepartamento") final  String departament){
//        return this.profissionalSaudeService.findByNumberMedicByDepartament(departament);
//    }
//
//    @PostMapping
//    public void createNew(@RequestBody final ProfissionalSaudeEntity profissional){
//        this.profissionalSaudeService.save(profissional);
//    }
//
//    @PutMapping
//    public void update(@RequestBody final ProfissionalSaudeEntity profissionalSaudeEntity){
//        this.profissionalSaudeService.save(profissionalSaudeEntity);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") final Long id){
//        this.profissionalSaudeService.deleteById(id);
//    }

}
