package pe.pariona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.pariona.domain.Entidad;
import pe.pariona.domain.Region;
import pe.pariona.domain.TipoEntidad;
import pe.pariona.repository.EntidadRepository;
import pe.pariona.repository.RegionRepository;
import pe.pariona.repository.TipoEntidadRepository;

@SpringBootApplication
public class AtrOptimizacionApplication implements CommandLineRunner {

	@Autowired
	private RegionRepository repoRegiones;
	
	@Autowired
	private TipoEntidadRepository repoTipoEntidad;
	
	@Autowired
	private EntidadRepository repoEntidad; 
	
	public static void main(String[] args) {
		SpringApplication.run(AtrOptimizacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Funciona...");
		cboEntidades();
		cboRegiones();
		cboTipoEntidad();
	}
	
	private void cboRegiones() {
		List<Region> regiones = repoRegiones.findByDepartamento();
		for (Region cat : regiones) {
			System.out.println(cat);
		}
	}
	
	private void cboTipoEntidad() {
		List<TipoEntidad> tipoEntidades = repoTipoEntidad.findAll();
		for (TipoEntidad cat : tipoEntidades) {
			System.out.println(cat.getCodtipo_entidad()+"-"+cat.getTipo_entidad());
		}
	}
	
	private void cboEntidades() {
		List<Entidad> entidades = repoEntidad.findAll();
		for (Entidad cat : entidades) {
			System.out.println(cat.getCodentidad()+"-"+cat.getRegion().getRegion()+"-"+cat.getTitulo_entidad());
		}
	}
}
