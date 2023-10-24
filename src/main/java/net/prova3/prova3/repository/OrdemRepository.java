package net.prova3.prova3.repository;

import net.prova3.prova3.model.Ordem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepository extends JpaRepository<Ordem, Integer> {
}
