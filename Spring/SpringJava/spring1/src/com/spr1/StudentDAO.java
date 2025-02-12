package com.spr1;
import org.springframework.jdbc.core.*;
import org.springframework.dao.*;
import java.sql.*;

public class StudentDAO 
{
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
		
	}
	public int save(Student s)
	{
		String qry="insert into Student values("+s.getRno()+",'"+s.getName()+"')";
		return jdbcTemplate.update(qry);
	}
	public Boolean savePS(Student s)
	{
		String qry="insert into Student values(?,?)";
		return jdbcTemplate.execute(qry,new PreparedStatementCallback<Boolean>()
				{
				@Override
				public Boolean doInPreparedStatement(PreparedStatement ps) 
						throws SQLException, DataAccessException{
			ps.setInt(1, s.getRno());
			ps.setString(2, s.getName());
			return ps.execute();
		}
	}
	);
	}
}