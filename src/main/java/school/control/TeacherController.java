package school.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.manager.TeacherManager;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
	
	@Autowired
	TeacherManager teacherManager;

}
