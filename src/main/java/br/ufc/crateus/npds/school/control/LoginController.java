package school.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import school.manager.LoginManager;
import school.model.Teacher;
import school.model.TeacherDTO;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	LoginManager loginManager; 
	
	@RequestMapping(method = RequestMethod.POST)
	public TeacherDTO autenticateTeacher(@RequestBody Teacher teacher) {
		return loginManager.autenticate(teacher);
	}
	
	
}
