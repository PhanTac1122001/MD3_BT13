package com.example.ss13b1.dao.impl;

import com.example.ss13b1.dao.IClassesDAO;
import com.example.ss13b1.entity.Classes;
import com.example.ss13b1.utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassesDaoImpl implements IClassesDAO {

    @Override
    public List<Classes> fillAll() {
        Connection connection= ConnectionDB.openConnection();
        List<Classes> classes=new ArrayList<>();
        try {
            PreparedStatement ps=connection.prepareStatement("select * from classes");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Classes classes1=new Classes();
                classes1.setClassId(rs.getString("classId"));
                classes1.setClassName(rs.getString("className"));
                classes1.setStatus(rs.getBoolean("status"));
                classes.add(classes1);

            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        finally {
            ConnectionDB.closeConnection(connection);
        }
        return classes;
    }
}
