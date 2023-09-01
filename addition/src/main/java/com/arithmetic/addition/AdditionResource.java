package com.arithmetic.addition;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/addition")
public class AdditionResource {
	@Inject
	private AdditionBLogic blogic;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Addition processAddition(Addition request) {
		Addition response = new Addition();
		response.setNum1(request.getNum1());
		response.setNum2(request.getNum2());
		response.setNum3(request.getNum3());
		response.setResult(blogic.execute(request.getNum1(), request.getNum2(), request.getNum3()));
		return response;
	}
}
