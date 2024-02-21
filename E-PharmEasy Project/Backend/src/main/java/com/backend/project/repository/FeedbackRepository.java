package com.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.project.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
