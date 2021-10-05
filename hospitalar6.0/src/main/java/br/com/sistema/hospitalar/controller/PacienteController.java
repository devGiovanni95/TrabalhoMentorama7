package br.com.sistema.hospitalar.controller;

import br.com.sistema.hospitalar.entities.PacienteEntity;
import br.com.sistema.hospitalar.repositories.PacienteRepository;
import br.com.sistema.hospitalar.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/pacientes")
public class PacienteController {

    private final List<PacienteEntity> pacientes = new ArrayList<>();

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<PacienteEntity>> findAll() {
       List<PacienteEntity> lista = pacienteRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PacienteEntity> findyById(@PathVariable("id") Long id){
        PacienteEntity paciente = pacienteService.findById(id);
        return  ResponseEntity.ok().body(paciente);
    }



    @PostMapping
    public @ResponseBody PacienteEntity newPacient(@RequestParam Long id,
                                                   @RequestParam String dataNascimento,
                                                   @RequestParam String nome ,
                                                   @RequestParam String telefone
                                                   ){
        PacienteEntity paciente = new PacienteEntity(id,dataNascimento,nome,telefone);
        pacienteRepository.save(paciente);
        return paciente;
    }
//
//    @PutMapping
//    public void update(@RequestBody final PacienteEntity pacienteEntity){
//        this.pacienteRepository.save(pacienteEntity);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") final Long id){
//        this.pacienteRepository.deleteById(id);
//    }


}

