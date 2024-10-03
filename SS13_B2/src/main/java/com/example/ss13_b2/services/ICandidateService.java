package com.example.ss13_b2.services;

import com.example.candidate_skill.entity.Candidates;

import java.sql.SQLException;

public interface ICandidateService
{
	void addNewCandidate(Candidates candidates, Integer skillId) throws SQLException;
}
