package com.pouchen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pouchen.bean.Spring;

public class SpringDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveSpring(Spring s) {
		String query = "insert into spring values("
				+ " '"+s.getId()+"','"+s.getName()+"','"+s.getSalary()+"')";
		return jdbcTemplate.update(query);
	
	}
	
	public int updSpring(Spring s) {
		String query = "update spring set"
				+ " name = '"+s.getName()+"',salary='"+s.getSalary()+"' where id = '"+s.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	public int delSpring(Spring s) {
		String query = "delete from spring where id = '"+s.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	public List<Spring> getAllSprings() {
		return jdbcTemplate.query("select * from spring", new ResultSetExtractor<List<Spring>>() {

			@Override
			public List<Spring> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Spring> list = new ArrayList<Spring>();
				while (rs.next()) {
					Spring spring = new Spring();
					spring.setId(rs.getInt(1));
					spring.setName(rs.getString(2));
					spring.setSalary(rs.getFloat(3));
					list.add(spring);
					
				}
				return list;
			}
		}) ;
	}
}
