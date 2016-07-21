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

@Table(name = "tb_event_plan_tarea_voluntario")
@Entity
public class EventPlanTareaVoluntario {

	private Integer idEventPlanTareaVoluntario;
	private EventPlanTarea fkEventPlanTarea;
	private Voluntario fkVoluntario;
	private TipoMotivo fkTipoMotivo;
	private String ejecucion;
	private String observacion;
	private Character estatus;

	public EventPlanTareaVoluntario() {
		super();
	}

	public EventPlanTareaVoluntario(Integer idEventPlanTareaVoluntario) {
		super();
		this.idEventPlanTareaVoluntario = idEventPlanTareaVoluntario;
	}

	public EventPlanTareaVoluntario(
			EventPlanTarea fkEventPlanTarea,
			Voluntario fkVoluntario,
			TipoMotivo fkTipoMotivo,
			String ejecucion,
			String observacion,
			Character estatus) {
		super();
		this.fkEventPlanTarea = fkEventPlanTarea;
		this.fkVoluntario = fkVoluntario;
		this.fkTipoMotivo = fkTipoMotivo;
		this.ejecucion = ejecucion;
		this.observacion = observacion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_tarea_voluntario_sequence", sequenceName = "public.tb_event_plan_tarea_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_tarea_voluntario_sequence")
	@Column(name="id_event_plan_tarea_voluntario")
	public Integer getIdEventPlanTareaVoluntario() {
		return idEventPlanTareaVoluntario;
	}

	public void setIdEventPlanTareaVoluntario(Integer idEventPlanTareaVoluntario) {
		this.idEventPlanTareaVoluntario = idEventPlanTareaVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_event_plan_tarea", nullable = false)
	public EventPlanTarea getFkEventPlanTarea() {
		return fkEventPlanTarea;
	}

	public void setFkEventPlanTarea(EventPlanTarea fkEventPlanTarea) {
		this.fkEventPlanTarea = fkEventPlanTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_voluntario", nullable = false)
	public Voluntario getFkVoluntario() {
		return fkVoluntario;
	}

	public void setFkVoluntario(Voluntario fkVoluntario) {
		this.fkVoluntario = fkVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="ejecucion")
	public String getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(String ejecucion) {
		this.ejecucion = ejecucion;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanTareaVoluntario == null) ? 0 : idEventPlanTareaVoluntario.hashCode());
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
		EventPlanTareaVoluntario other = (EventPlanTareaVoluntario) obj;
		if (idEventPlanTareaVoluntario == null) {
			return false;
		} 
		if (!idEventPlanTareaVoluntario.equals(other.idEventPlanTareaVoluntario)) {
			return false;
		} 
		return true;
	}

}
