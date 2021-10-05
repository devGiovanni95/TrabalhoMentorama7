package br.com.sistema.hospitalar.controller;

import br.com.sistema.hospitalar.entities.InternacaoEntity;
import br.com.sistema.hospitalar.entities.ProfissionalSaudeEntity;
import br.com.sistema.hospitalar.repositories.InternacaoRepository;
import br.com.sistema.hospitalar.service.InternacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/internacoes")
public class InternacaoController {

    @Autowired
    private  InternacaoRepository internacaoRepository;

    @Autowired
    private InternacaoService internacaoService;

    @GetMapping
    public ResponseEntity<List<InternacaoEntity>> findAll() {
        List<InternacaoEntity> lista = internacaoRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InternacaoEntity> findyById(@PathVariable("id") Long id){
        InternacaoEntity profissional = internacaoService.findById(id);
        return  ResponseEntity.ok().body(profissional);
    }

    @PostMapping
    public void createNew(@RequestBody final InternacaoEntity product) {
        this.internacaoRepository.save(product);
    }

    @PutMapping
    public void update(@RequestBody final InternacaoEntity productEntity) {
        this.internacaoRepository.save(productEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.internacaoRepository.deleteById(id);
    }
}
