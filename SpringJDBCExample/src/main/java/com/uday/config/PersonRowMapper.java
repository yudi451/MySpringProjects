package com.uday.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uday.model.Person;

public class PersonRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setPersonId(rs.getInt("person_id"));
		person.setFirstName(rs.getString("first_name"));
		person.setLastName(rs.getString("last_name"));
		person.setEmail((rs).getString("email"));
		return person;
	}
	
}
