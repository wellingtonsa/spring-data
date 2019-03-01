package school.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.manager.exception.InvalidDataException;
import school.manager.exception.UserNotFoundException;
import school.model.Teacher;
import school.model.TeacherDTO;
import school.repository.TeacherRepository;

@Service
public class LoginManager {

	@Autowired
	TeacherRepository teacherRepository;

	public TeacherDTO autenticate(Teacher teacher) {
		Teacher teacher_ = teacherRepository.findByLogin(teacher.getLogin());

		if (teacher_ == null)
			throw new UserNotFoundException(teacher.getName());
		else if (!(teacher_.getLogin().equals(teacher.getLogin())))
			throw new InvalidDataException("Invalid login");
		else if (!(teacher_.getPassword().equals(teacher.getPassword())))
			throw new InvalidDataException("Invalid password");

		return new TeacherDTO(teacher_);
	}

}
