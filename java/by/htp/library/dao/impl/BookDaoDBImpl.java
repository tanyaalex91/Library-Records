package by.htp.library.dao.impl;

import static by.htp.library.dao.util.DataBaseConnectionHelper.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.cj.api.jdbc.Statement;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class BookDaoDBImpl implements BookDao {
	private static final String SQL_SELECT_BOOKS = "select * from book";

	public void create(Book entity) {

	}

	public Book read(int id) {

		return null;
	}

	public List<Book> readAll() {
		List<Book> books = new ArrayList<Book>();
		Connection connection = connect();
		
	
			try {
		
			java.sql.Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);
		
			

			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setDescription(rs.getString("description"));
				book.setAuthor(rs.getString("author"));

				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		disconnect(connection);

		return books;
	}

	public void update(Book entity) {

	}

	public void delete(int id) {

	}

}