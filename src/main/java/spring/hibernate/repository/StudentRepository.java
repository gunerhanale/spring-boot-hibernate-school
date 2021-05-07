package spring.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.hibernate.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
