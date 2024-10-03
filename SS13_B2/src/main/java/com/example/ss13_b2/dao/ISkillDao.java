package com.example.ss13_b2.dao;

import com.example.candidate_skill.entity.Skills;

import java.util.List;

public interface ISkillDao
{
	List<Skills> findAll();
}
