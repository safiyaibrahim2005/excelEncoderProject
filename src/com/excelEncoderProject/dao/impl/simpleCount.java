package com.excelEncoderProject.dao.impl;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.excelEncoderProject.model.excelLoad;
import com.excelEncoderProject.model.initialLoad;
import com.excelEncoderProject.rowMapper.excelInitialRowMapper;



public class simpleCount extends JdbcDaoSupport {
	excelInitialRowMapper excelintial =new excelInitialRowMapper();
	
public int countRows() {
		
		
		String sql="select count(*) from initial_load";
		
	return this.getJdbcTemplate().queryForInt(sql);
		
		
	}

public void savetoDisk(initialLoad iloadModel) {
	String SQLInsert ="Insert into initial_load (id,name) values (?,?)";
	
	this.getJdbcTemplate().update(SQLInsert, new Object [] {iloadModel.getId(),iloadModel.getName()});
}

public void saveExceltoDisk(excelLoad eLoad) {

	String SQLInsert ="Insert into excel_load2 (id,incidentid,title,status,urgency,priority,AG,assignee) values (?,?,?,?,?,?,?,?)";
	this.getJdbcTemplate().update(SQLInsert,new Object[] {eLoad.getId(),eLoad.getIncident(),eLoad.getTitle(),eLoad.getStatus(),eLoad.getUrgency(),eLoad.getPriority(),eLoad.getAG(),eLoad.getAssignee()});
}

	

}
