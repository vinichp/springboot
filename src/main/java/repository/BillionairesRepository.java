package repository;

import org.springframework.data.repository.CrudRepository;

import entities.Billionaires;

public interface BillionairesRepository extends CrudRepository<Billionaires, Long> {
}