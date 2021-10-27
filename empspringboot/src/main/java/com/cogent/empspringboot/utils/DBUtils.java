package com.cogent.empspringboot.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	@Autowired
	DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}
}
