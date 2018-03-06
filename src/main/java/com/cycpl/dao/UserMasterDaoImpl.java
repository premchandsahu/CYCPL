package com.cycpl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cycpl.model.Modules;



@Repository
public class UserMasterDaoImpl implements UserMasterDao {

	JdbcTemplate template; 
	
	@Autowired
		public void setTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  
	
	public int checkLogin(String pusername,String ppassword)
	{
		return 1;
	}
	public List<Modules> getMenu(String pusername){  
	    return template.query("select 'Menu C1','Menu C2','Menu C3','Menu C4' from dual",new RowMapper<Modules>(){  
	        public Modules mapRow(ResultSet rs, int row) throws SQLException {  
	        	Modules e=new Modules();  
	            e.setModulename(rs.getString(1));  
	            e.setParentmodulename(rs.getString(2));  
	            e.setModuleuri(rs.getString(4));
	            return e;  
	        }  
	    });  
	} 
	
}
