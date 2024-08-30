package max.com.sa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import max.com.sa.entites.Sentiment;
import max.com.sa.service.SentimentService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "sentiment", produces = APPLICATION_JSON_VALUE)
public class SentimentController {

    private SentimentService sentimentService;
    
    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createSentiment(@RequestBody Sentiment sentiment) {
        this.sentimentService.createSentiment(sentiment);
    }
}
