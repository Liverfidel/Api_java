package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CursoModel;

public interface CursoRepository extends JpaRepository<CursoModel, Long>{

}
