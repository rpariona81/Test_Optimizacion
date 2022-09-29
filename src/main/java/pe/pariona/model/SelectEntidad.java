package pe.pariona.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.pariona.domain.Entidad;
import pe.pariona.domain.Region;
import pe.pariona.repository.EntidadRepository;
import pe.pariona.repository.RegionRepository;
import pe.pariona.repository.TipoEntidadRepository;

public class SelectEntidad {

	@Autowired
	private RegionRepository repoRegiones;
	
	@Autowired
	private TipoEntidadRepository repoTipoEntidad;
	
	@Autowired
	private EntidadRepository repoEntidad;
	
	public List<Entidad> getEntidades(Region region, Integer codtipoentidad){
		List<Entidad> entidades = repoEntidad.findByRegionAndCodtipoentidad(region, codtipoentidad);
		return entidades;
	}
}
