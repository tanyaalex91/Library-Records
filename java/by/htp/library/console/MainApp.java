package by.htp.library.console;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.bean.Employee;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.EmployeeDao;
import by.htp.library.dao.impl.BookDaoDBImpl;
import by.htp.library.dao.impl.EmployeeDaoImpl;

public class MainApp {

	public static void main(String[] args) {
		
		BookDao dao = new BookDaoDBImpl();
		List<Book> books = dao.readAll();
		
		for(Book book : books) {
			System.out.println(book);
			
			
			EmployeeDao dao1 = new EmployeeDaoImpl();
			List<Employee> employees = dao1.readAll();
			for(Employee employee:employees) {
				System.out.println(employee);
			}
			
		}

	}

}