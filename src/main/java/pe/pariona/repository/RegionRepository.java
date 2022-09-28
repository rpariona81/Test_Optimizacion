package pe.pariona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.pariona.model.Region;

public interface RegionRepository extends JpaRepository<Region, Integer>{
	
	@Query("SELECT u FROM Region u WHERE u.departamento is not null")
	List<Region> findByDepartamento();
}
