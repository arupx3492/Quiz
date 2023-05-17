package com.example.HaliverseQuizSystem.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Data
@RequiredArgsConstructor
public class QuizAnswerDto {
	private String question;
	private List<String> options;
	private String answer;


}
