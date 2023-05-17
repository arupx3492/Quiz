package com.example.HaliverseQuizSystem.service;
import com.example.HaliverseQuizSystem.dto.QuizAnswerDto;
import com.example.HaliverseQuizSystem.exception.QuizException;
import com.example.HaliverseQuizSystem.model.Quiz;
import java.util.List;

public interface QuizService {
	public Quiz createQuiz(Quiz quiz) throws QuizException;
	public List<Quiz> getActiveQuiz() throws QuizException;
	public List<Quiz> getAllQuizzes() throws QuizException;
	public QuizAnswerDto getQuizResult(Long id) throws QuizException;
}
