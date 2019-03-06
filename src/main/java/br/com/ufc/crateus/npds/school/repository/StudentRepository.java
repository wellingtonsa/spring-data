package br.com.ufc.crateus.npds.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.ufc.crateus.npds.school.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	@Query("SELECT s FROM Student s WHERE s.name = ?1")
	List<Student> findByName(String name);
}
