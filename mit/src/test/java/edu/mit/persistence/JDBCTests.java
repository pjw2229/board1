package edu.mit.persistence;

import java.sql.DriverManager;
import org.junit.Test;
import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	@Test
	public void testConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "mit", "pw1234");
		log.info("mysql 연결 성공!");
	}
}