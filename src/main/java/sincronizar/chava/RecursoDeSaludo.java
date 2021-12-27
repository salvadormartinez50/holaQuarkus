package sincronizar.chava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sincronizar.models.Hola;


@Path("/hola")
public class RecursoDeSaludo {
	

	@GET
	@Produces("application/json")
	public Hola Hola() {
		Hola hola = new Hola();
		return hola;
	}

}
