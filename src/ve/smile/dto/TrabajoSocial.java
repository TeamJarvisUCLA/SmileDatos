package ve.smile.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_trabajo_social")
@Entity
public class TrabajoSocial {

	private Integer idTrabajoSocial;
	private ClasificadorTrabajoSocial fkClasificadorTrabajoSocial;
	private String nombre;
	private String descripcion;

	private List<Actividad> trabajoSocialActividades;
	private List<Indicador> trabajoSocialIndicadores;

	public TrabajoSocial() {
		super();
	}

	public TrabajoSocial(Integer idTrabajoSocial) {
		super();
		this.idTrabajoSocial = idTrabajoSocial;
	}

	public TrabajoSocial(ClasificadorTrabajoSocial fkClasificadorTrabajoSocial,
			String nombre, String descripcion) {
		super();
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_trabajo_social_sequence", sequenceName = "public.tb_trabajo_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_trabajo_social_sequence")
	@Column(name = "id_trabajo_social")
	public Integer getIdTrabajoSocial() {
		return idTrabajoSocial;
	}

	public void setIdTrabajoSocial(Integer idTrabajoSocial) {
		this.idTrabajoSocial = idTrabajoSocial;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_trabajo_social", nullable = false)
	public ClasificadorTrabajoSocial getFkClasificadorTrabajoSocial() {
		return fkClasificadorTrabajoSocial;
	}

	public void setFkClasificadorTrabajoSocial(
			ClasificadorTrabajoSocial fkClasificadorTrabajoSocial) {
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToMany
	@JoinTable(name = "tb_plantilla_trabajo_social_actividad", joinColumns = @JoinColumn(name = "fk_trabajo_social"), inverseJoinColumns = @JoinColumn(name = "fk_actividad"))
	public List<Actividad> getTrabajoSocialActividades() {
		return trabajoSocialActividades;
	}

	public void setTrabajoSocialActividades(
			List<Actividad> trabajoSocialActividades) {
		this.trabajoSocialActividades = trabajoSocialActividades;
	}

	@ManyToMany
	@JoinTable(name = "tb_plantilla_trabajo_social_indicador", joinColumns = @JoinColumn(name = "fk_trabajo_social"), inverseJoinColumns = @JoinColumn(name = "fk_indicador"))
	public List<Indicador> getTrabajoSocialIndicadores() {
		return trabajoSocialIndicadores;
	}

	public void setTrabajoSocialIndicadores(
			List<Indicador> trabajoSocialIndicadores) {
		this.trabajoSocialIndicadores = trabajoSocialIndicadores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idTrabajoSocial == null) ? 0 : idTrabajoSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TrabajoSocial other = (TrabajoSocial) obj;
		if (idTrabajoSocial == null) {
			return false;
		}
		if (!idTrabajoSocial.equals(other.idTrabajoSocial)) {
			return false;
		}
		return true;
	}

}
