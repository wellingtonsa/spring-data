package school.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import school.model.Student;
import school.repository.StudentRepository;
import school.manager.exception.InvalidDataException;
import school.manager.exception.UserExistsException;
import school.manager.exception.UserNotFoundException;

@Service
public class StudentManager {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> listAll() {
		return (List<Student>) studentRepository.findAll();
	}

	public Student save(Student student) {
		try {

			if (getTeacher(student.getId()) != null)
				throw new UserExistsException();

			studentRepository.save(student);

			return student;
		} catch (DataIntegrityViolationException e) {
			throw new InvalidDataException("Invalid data");
		}
	}

	public Student obtainValueKey(int id) {
		Student student = studentRepository.findOne(id);
		
		if(student == null) throw new UserNotFoundException(" ");
		return studentRepository.findOne(id);
	}
	
	private Student getTeacher(int id) {
		return studentRepository.findOne(id);
	}

	public void delete(int id) {
		 
		if (getTeacher(id) == null)
			throw new UserNotFoundException(" ");

		studentRepository.delete(id);
	}

	public void update(Student student, int id) {
		
		if (getTeacher(id) == null)
			throw new UserNotFoundException(" ");

		studentRepository.save(student);
	}

	public List<Student> search(String name) {

		List<Student> students = studentRepository.findByName(name);

		if (students.size() == 0)
			throw new UserNotFoundException(name);

		return studentRepository.findByName(name);
	}

}
