package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CargoModel;

public interface CargoRepository extends JpaRepository<CargoModel, Long>{

}
