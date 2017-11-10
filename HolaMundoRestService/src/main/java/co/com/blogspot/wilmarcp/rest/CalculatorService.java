package co.com.blogspot.wilmarcp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import co.com.blogspot.wilmarcp.exception.NegativeNumberNotPermitException;
import co.com.blogspot.wilmarcp.service.StringCalculator;

@Path("calculate/{expresion}")
public class CalculatorService {
	
	@GET
	@Produces("text/plan")
	public String calcular(@PathParam("expresion") String expresion) {
		String mensajeRetorno = "";
		try {
			mensajeRetorno = String.valueOf(StringCalculator.add(expresion));
		}catch(NegativeNumberNotPermitException e) {
			mensajeRetorno = e.getMessage();
		}
		return mensajeRetorno;
	}

}
