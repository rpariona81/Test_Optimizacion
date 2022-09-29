package pe.pariona.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_regiones")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String codregion;
	private String region;
	private String region_alias;
	private String region_politica;
	private String mapa;
	private String departamento;
	private String nombre_iso_3166_2;
	private String codigo_iso_3166_2;
	private String folder;
	private String url_folder;
	private String ruta_alterna;
	private Integer estado;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Region() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodregion() {
		return codregion;
	}
	public void setCodregion(String codregion) {
		this.codregion = codregion;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_alias() {
		return region_alias;
	}
	public void setRegion_alias(String region_alias) {
		this.region_alias = region_alias;
	}
	public String getRegion_politica() {
		return region_politica;
	}
	public void setRegion_politica(String region_politica) {
		this.region_politica = region_politica;
	}
	public String getMapa() {
		return mapa;
	}
	public void setMapa(String mapa) {
		this.mapa = mapa;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNombre_iso_3166_2() {
		return nombre_iso_3166_2;
	}
	public void setNombre_iso_3166_2(String nombre_iso_3166_2) {
		this.nombre_iso_3166_2 = nombre_iso_3166_2;
	}
	public String getCodigo_iso_3166_2() {
		return codigo_iso_3166_2;
	}
	public void setCodigo_iso_3166_2(String codigo_iso_3166_2) {
		this.codigo_iso_3166_2 = codigo_iso_3166_2;
	}
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}
	public String getUrl_folder() {
		return url_folder;
	}
	public void setUrl_folder(String url_folder) {
		this.url_folder = url_folder;
	}
	public String getRuta_alterna() {
		return ruta_alterna;
	}
	public void setRuta_alterna(String ruta_alterna) {
		this.ruta_alterna = ruta_alterna;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
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
	
	@Override
	public String toString() {
		return "Region [codregion=" + codregion + ", region=" + region + ", departamento=" + departamento.toUpperCase() + "]";
	}
}
