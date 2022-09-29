package pe.pariona.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_tipoentidad")
public class TipoEntidad {
	@Id
	private Integer codtipo_entidad;

	private Integer visible;
	private String tipo_entidad;
	
	public TipoEntidad() {
		
	}

	public Integer getCodtipo_entidad() {
		return codtipo_entidad;
	}

	public void setCodtipo_entidad(Integer codtipo_entidad) {
		this.codtipo_entidad = codtipo_entidad;
	}
	
	public Integer getVisible() {
		return visible;
	}
	public void setVisible(Integer visible) {
		this.visible = visible;
	}
	
	public String getTipo_entidad() {
		return tipo_entidad;
	}
	public void setTipo_entidad(String tipo_entidad) {
		this.tipo_entidad = tipo_entidad;
	}
	
}
