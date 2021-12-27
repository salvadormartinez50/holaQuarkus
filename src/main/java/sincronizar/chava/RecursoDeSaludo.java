package sincronizar.chava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hola")
public class RecursoDeSaludo {

	@GET
	@Produces("application/json")
	public String Hola() {
		return "Hola Servicio REST";
	}

}
