package UnderTheC.DeepSea.repository;

import UnderTheC.DeepSea.Entity.Evaluation;
import UnderTheC.DeepSea.Entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.function.Function;
import java.util.Date;
@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, String> {
    List<Evaluation> findByLectureNameOrderByLikeCountAsc(String lectureName);
    List<Evaluation> findByLectureNameOrderByCreated_atDesc(String lectureName);
    List<Evaluation> findByLectureName(String lectureName);
}
