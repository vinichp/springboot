package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Pessoa;

@Repository
public interface CervejaRepository extends JpaRepository<Pessoa, Long>{

}
