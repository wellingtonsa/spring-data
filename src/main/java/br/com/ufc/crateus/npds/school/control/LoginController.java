package br.com.ufc.crateus.npds.school.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufc.crateus.npds.school.manager.LoginManager;
import br.com.ufc.crateus.npds.school.model.Teacher;
import br.com.ufc.crateus.npds.school.model.TeacherDTO;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	LoginManager loginManager; 
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public TeacherDTO autenticateTeacher(@RequestBody Teacher teacher) {
		return loginManager.autenticate(teacher);
	}
	
	
}
