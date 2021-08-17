package br.com.sistema.hospitalar.controller;

import br.com.sistema.hospitalar.entities.InternacaoEntity;
import br.com.sistema.hospitalar.repositories.InternacaoRepository;
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

    @GetMapping
    public ResponseEntity<List<InternacaoEntity>> findAll() {
        List<InternacaoEntity> lista = internacaoRepository.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public InternacaoEntity findById(@PathVariable("id") final Long id) {
        return this.internacaoRepository.findById(id).orElse(null);
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
