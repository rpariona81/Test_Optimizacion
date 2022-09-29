package pe.pariona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.pariona.domain.Entidad;
import pe.pariona.domain.Region;

public interface EntidadRepository extends JpaRepository<Entidad, Integer>{

	List<Entidad> findByRegionAndCodtipoentidad(Region region, Integer codtipoentidad);

}
