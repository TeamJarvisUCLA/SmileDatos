package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_solicitud_ayuda_recurso")
@Entity
public class SolicitudAyudaRecurso {

	private Integer idSolicitudAyudaRecurso;
	private Recurso fkRecurso;
	private SolicitudAyuda fkSolicitudAyuda;
	private Integer cantidad;

	public SolicitudAyudaRecurso() {
		super();
	}

	public SolicitudAyudaRecurso(Integer idSolicitudAyudaRecurso) {
		super();
		this.idSolicitudAyudaRecurso = idSolicitudAyudaRecurso;
	}

	public SolicitudAyudaRecurso(
			Recurso fkRecurso,
			SolicitudAyuda fkSolicitudAyuda,
			Integer cantidad) {
		super();
		this.fkRecurso = fkRecurso;
		this.fkSolicitudAyuda = fkSolicitudAyuda;
		this.cantidad = cantidad;
	}

	@Id
	@SequenceGenerator(name = "tb_solicitud_ayuda_recurso_sequence", sequenceName = "public.tb_solicitud_ayuda_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_solicitud_ayuda_recurso_sequence")
	@Column(name="id_solicitud_ayuda_recurso")
	public Integer getIdSolicitudAyudaRecurso() {
		return idSolicitudAyudaRecurso;
	}

	public void setIdSolicitudAyudaRecurso(Integer idSolicitudAyudaRecurso) {
		this.idSolicitudAyudaRecurso = idSolicitudAyudaRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_recurso", nullable = false)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_solicitud_ayuda", nullable = false)
	public SolicitudAyuda getFkSolicitudAyuda() {
		return fkSolicitudAyuda;
	}

	public void setFkSolicitudAyuda(SolicitudAyuda fkSolicitudAyuda) {
		this.fkSolicitudAyuda = fkSolicitudAyuda;
	}

	@Column(name="cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSolicitudAyudaRecurso == null) ? 0 : idSolicitudAyudaRecurso.hashCode());
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
		SolicitudAyudaRecurso other = (SolicitudAyudaRecurso) obj;
		if (idSolicitudAyudaRecurso == null) {
			return false;
		} 
		if (!idSolicitudAyudaRecurso.equals(other.idSolicitudAyudaRecurso)) {
			return false;
		} 
		return true;
	}

}
