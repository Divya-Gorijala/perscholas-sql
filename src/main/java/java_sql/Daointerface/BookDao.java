package java_sql.Daointerface;

import java_sql.model.Books;

import java.sql.SQLException;
import java.util.List;

public interface BookDao{
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    void saveBook(List<Books> BookList) throws ClassNotFoundException;

    boolean deleteBook(int id);

    boolean updateBook(Books book, int id);



}