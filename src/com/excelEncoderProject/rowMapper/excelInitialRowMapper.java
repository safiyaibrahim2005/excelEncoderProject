package com.excelEncoderProject.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.excelEncoderProject.model.initialLoad;

public class excelInitialRowMapper implements RowMapper<initialLoad>{
	


	@Override
	public initialLoad mapRow(ResultSet resultset, int index) throws SQLException {
		// TODO Auto-generated method stub
		initialLoad iLoad = new initialLoad();
		iLoad.setId(resultset.getInt("id"));
		iLoad.setName(resultset.getString("Name"));
	
		return iLoad;
	}
}
