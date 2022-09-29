package pe.pariona.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_entidades")
public class Entidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "region_id")
	private Region region;
	
	private String codentidad;
	private String entidad;
	private String titulo_entidad;
	private Integer codtipoentidad;
	private Integer codgestionentidad;
	private Integer estado;
	private Integer flag_visible;
	private Integer flag_formulario;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public String getCodentidad() {
		return codentidad;
	}
	public void setCodentidad(String codentidad) {
		this.codentidad = codentidad;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getTitulo_entidad() {
		return titulo_entidad;
	}
	public void setTitulo_entidad(String titulo_entidad) {
		this.titulo_entidad = titulo_entidad;
	}
	public Integer getCodtipoentidad() {
		return codtipoentidad;
	}
	public void setCodtipoentidad(Integer codtipoentidad) {
		this.codtipoentidad = codtipoentidad;
	}
	public Integer getCodgestionentidad() {
		return codgestionentidad;
	}
	public void setCodgestionentidad(Integer codgestionentidad) {
		this.codgestionentidad = codgestionentidad;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getFlag_visible() {
		return flag_visible;
	}
	public void setFlag_visible(Integer flag_visible) {
		this.flag_visible = flag_visible;
	}
	public Integer getFlag_formulario() {
		return flag_formulario;
	}
	public void setFlag_formulario(Integer flag_formulario) {
		this.flag_formulario = flag_formulario;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
}
