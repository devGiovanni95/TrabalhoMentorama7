package br.com.sistema.hospitalar.service;

import br.com.sistema.hospitalar.entities.PacienteEntity;
import br.com.sistema.hospitalar.repositories.PacienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public PacienteEntity findById(Long id) {
        Optional<PacienteEntity> paciente = pacienteRepository.findById(id);
        return paciente.orElseThrow(() -> new RuntimeException());
    }

    public PacienteEntity insert(PacienteEntity obj) {
        obj.setId(null);
        return pacienteRepository.save(obj);
    }

    public PacienteEntity update(PacienteEntity obj) {
        findById(obj.getId());
        return pacienteRepository.save(obj);
    }

    public void delete(Long id) throws DateIntegrityException {
        findById(id);
        try {
            pacienteRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DateIntegrityException("Não é possível excluir uma Paciente ");

        }

    }
}