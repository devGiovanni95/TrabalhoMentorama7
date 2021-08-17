package br.com.sistema.hospitalar.repositories;

import br.com.sistema.hospitalar.entities.ProfissionalSaudeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfissionalSaudeRepository extends JpaRepository<ProfissionalSaudeEntity, Long> {
    /*Contagem do numero de medicos por departamento*/
//    select departamento,
//    count(departamento) as quantidade_por_departamento
//    from profissional_saude
//    group by departamento
//    order by quantidade_por_departamento desc;
    /*Contagem do numero de medicos por departamento*/

    @Query(value = "select departamento, count(departamento) " +
            "as quantidade_por_departamento from profissional_saude_entity" +
            " group by departamento order by quantidade_por_departamento desc", nativeQuery = true)
    List<ProfissionalSaudeEntity> findByNumberMedicByDepartament(ProfissionalSaudeEntity departament);
//    ResponseEntity<ProfissionalSaudeEntity> findByNumberMedicByDepartament(ProfissionalSaudeEntity departament);


// @Query(value = "select d FROM departamento d, count(departamento) " +
//            "as quantidade_por_departamento from profissional_saude_entity" +
//            " group by departamento order by quantidade_por_departamento desc")
////    Optional<Object> findByNumberMedicByDepartament(String departament);
//    ResponseEntity<ProfissionalSaudeEntity> findByNumberMedicByDepartament(ProfissionalSaudeEntity departament);


//    List<ProfissionalSaudeEntity> findByNumberMedicByDepartament(String departament, List<ProfissionalSaudeEntity>profissionalSaudeEntities);

}
