package com.backend.project.service;

import java.util.List;

import com.backend.project.entities.Feedback;

public interface FeedbackService {

	void saveFeedback(Feedback feedback);

	List<Feedback> findAllFeedbacks();

}
