package com.example.ss13_b2.dao;

import com.example.candidate_skill.entity.Candidates;

import java.sql.SQLException;

public interface ICandidateDao
{
	void addNewCandidate(Candidates candidates, Integer skillId) throws SQLException;
}
