package com.example.ss13b1.service.impl;

import com.example.ss13b1.dao.IClassesDAO;
import com.example.ss13b1.dao.impl.ClassesDaoImpl;
import com.example.ss13b1.entity.Classes;
import com.example.ss13b1.service.IClassesService;

import java.util.List;

public class ClassesServiceImpl implements IClassesService {
    IClassesDAO classesDAO=new ClassesDaoImpl();
    @Override
    public List<Classes> fillAll() {
        return classesDAO.fillAll();
    }
}
