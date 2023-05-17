package com.example.HaliverseQuizSystem.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@RequiredArgsConstructor
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	@NotNull
	@NotEmpty
	private String question;
	@ElementCollection
	@CollectionTable(name = "quiz_options")
	@NotNull
	@NotEmpty
	private List<String> options;
	@Column(nullable = false)
	@NotNull
	private int rightAnswerIndex;
	@Column(nullable = false)
	@NotNull
	private LocalDateTime startDate;
	@Column(nullable = false)
	@NotNull
	private LocalDateTime endDate;
	@Column(nullable = false)
	@NotNull
	private QuizStatus  status;


}
