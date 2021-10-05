package br.com.sistema.hospitalar.service;

import br.com.sistema.hospitalar.entities.PacienteEntity;
import br.com.sistema.hospitalar.repositories.PacienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public PacienteEntity findById(Long id){
        Optional<PacienteEntity> paciente = pacienteRepository.findById(id);
       return paciente.orElseThrow(() -> new RuntimeException() );
    }

}
