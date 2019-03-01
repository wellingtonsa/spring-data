package school.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.repository.TeacherRepository;

@Service
public class TeacherManager {
	
	@Autowired
	TeacherRepository teacherRepository;

}
