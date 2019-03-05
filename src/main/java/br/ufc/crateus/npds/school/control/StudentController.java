package school.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import school.manager.StudentManager;
import school.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentManager studentManager;

	@RequestMapping(method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentManager.save(student);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student viewStudent(@PathVariable int id) {
		return studentManager.obtainValueKey(id); 
	} 

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeStudent(@PathVariable("id") int id) {
		studentManager.delete(id);
	} 

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void editStudent(@RequestBody Student student, @PathVariable int id) {
		studentManager.update(student, id);
	} 

	@RequestMapping(params = "name", method = RequestMethod.GET)
		public List<Student> searchStudent(@RequestParam("name") String name) {
			return studentManager.search(name);
	} 

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Student> listStudents(){
		return studentManager.listAll();
	} 
} 


