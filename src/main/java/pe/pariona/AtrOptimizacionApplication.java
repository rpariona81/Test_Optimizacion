package pe.pariona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.pariona.model.Region;
import pe.pariona.model.TipoEntidad;
import pe.pariona.repository.RegionRepository;
import pe.pariona.repository.TipoEntidadRepository;

@SpringBootApplication
public class AtrOptimizacionApplication implements CommandLineRunner {

	@Autowired
	private RegionRepository repoRegiones;
	
	@Autowired
	private TipoEntidadRepository repoTipoEntidad; 
	
	public static void main(String[] args) {
		SpringApplication.run(AtrOptimizacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Funciona...");
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
}
