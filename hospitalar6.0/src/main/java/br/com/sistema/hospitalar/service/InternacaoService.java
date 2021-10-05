package br.com.sistema.hospitalar.service;

import br.com.sistema.hospitalar.entities.InternacaoEntity;
import br.com.sistema.hospitalar.entities.PacienteEntity;
import br.com.sistema.hospitalar.repositories.InternacaoRepository;
import br.com.sistema.hospitalar.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InternacaoService {

    @Autowired
    private InternacaoRepository internacaoRepository;

    public InternacaoEntity findById(Long id){
        Optional<InternacaoEntity> paciente = internacaoRepository.findById(id);
       return paciente.orElseThrow(() -> new RuntimeException() );
    }

}
