package max.com.sa.service;

import org.springframework.stereotype.Service;

import max.com.sa.entites.Sentiment;
import max.com.sa.repository.SentimentRepository;

@Service
public class SentimentService {

    private SentimentRepository sentimentRepository;

    public void createSentiment(Sentiment sentiment) {
        this.sentimentRepository.save(sentiment);
    }

    public SentimentService(SentimentRepository sentimentRepository) {
        this.sentimentRepository = sentimentRepository;
    }
}
