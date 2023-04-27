package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import cogent.infotech.com.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	@Query(value ="SELECT * From question where status = ?1"
			,nativeQuery = true)
	List<Question> findByStatus(String status);
	@Modifying
	@Transactional
	@Query(value ="UPDATE Question q set q.status = ?2 where q.id = ?1"
			,nativeQuery = true)
	void updateQuestionStatus(int id, String status);
	List<Question> findById(int id);
	List<Question> findByTopic(String topic);

}
