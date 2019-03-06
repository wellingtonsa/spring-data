package br.com.ufc.crateus.npds.school.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufc.crateus.npds.school.manager.TeacherManager;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
	
	@Autowired
	TeacherManager teacherManager;

}
