package br.com.sistema.hospitalar.service;

import br.com.sistema.hospitalar.entities.PacienteEntity;
import br.com.sistema.hospitalar.entities.ProfissionalSaudeEntity;
import br.com.sistema.hospitalar.repositories.PacienteRepository;
import br.com.sistema.hospitalar.repositories.ProfissionalSaudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfisssionalSaudeService {

    @Autowired
    private ProfissionalSaudeRepository profissionalSaudeRepository;

    public ProfissionalSaudeEntity findById(Long id){
        Optional<ProfissionalSaudeEntity> paciente = profissionalSaudeRepository.findById(id);
       return paciente.orElseThrow(() -> new RuntimeException() );
    }

}
