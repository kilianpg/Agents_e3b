package es.uniovi.asw.e3b.agents_e3b.agents.web_service.responses.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Wrong kind style")
public class WrongKindErrorResponse extends ErrorResponse{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessageJSONFormat() {
		// TODO Auto-generated method stub
		return "{\"reason\": \"Wrong kind style\"}";
	}

	@Override
	public String getMessageStringFormat() {
		
		 return "Wrong kind style";
	}

}
