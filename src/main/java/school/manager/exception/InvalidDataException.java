package school.manager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidDataException extends RuntimeException {

	public InvalidDataException(String data) {
		super(data);
	}

}
