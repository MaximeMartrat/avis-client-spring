package max.com.sa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import max.com.sa.entites.Sentiment;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {

}
