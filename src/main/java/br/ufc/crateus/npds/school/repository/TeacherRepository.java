package school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import school.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer>{

	@Query("SELECT t FROM Teacher t WHERE t.login = ?1")
	Teacher findByLogin(String login);
}
