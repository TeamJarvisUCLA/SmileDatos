package ve.smile.seguridad.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.seguridad.dto.Sclass;
import lights.core.payload.response.IPayloadResponse;

public class PayloadSclassResponse implements IPayloadResponse<Sclass> {

	private HashMap<String, Object> informacion;

	private List<Sclass> objetos;

	public PayloadSclassResponse() {
		super();
		this.informacion = new HashMap<String, Object>();
	}

	@Override
	public Object getInformacion(String key) {
		return informacion.get(key);
	}

	@Override
	public void setInformacion(String key, Object informacion) {
		this.informacion.put(key, informacion);
	}

	@Override
	public List<Sclass> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Sclass> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
