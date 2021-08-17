package br.com.sistema.hospitalar.repositories;

import br.com.sistema.hospitalar.entities.InternacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternacaoRepository extends JpaRepository<InternacaoEntity, Long> {


}
