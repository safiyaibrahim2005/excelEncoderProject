package com.excelEncoderProject.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.excelEncoderProject.dao.initialLoadDAO;

public class initialLoadImpl implements initialLoadDAO{

	
	
public  DataSource datasource;
	
	private JdbcTemplate jdbcTemplateObject;
	
	public void saveinitialExcel(int Key) {
		
		String SQLInsert ="Insert into initialExcel (key,name) values (?,?)";
jdbcTemplateObject.update(SQLInsert,"key","name");


		
	}
	
public DataSource getDatasource() {
		return datasource;
	}



	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		
	}



public String createInsert() {
	
	
	return "";
}
}
