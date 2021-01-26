package br.edu.ifpb.dac.gabriel.aragao.bookapi.service;

import br.edu.ifpb.dac.gabriel.aragao.model.Book;
import br.edu.ifpb.dac.gabriel.aragao.model.Author;
import br.edu.ifpb.dac.gabriel.aragao.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public Book save(Book book){
    return bookRepository.save(book);
  }

  public Book update(Book updatedbook){
    Book book = bookRepository.findOne(updatedBook.getId());
    book.setTitle(updateBook.getTitle());
    book.setSubtitle(updateBook.getSubtitle());
    book.setAuthors(updateBook.getAuthors());
    book.setYear(updateBook.getYear());
    book.setPrice(updateBook.getPrice());

    return save(book);
  }
  
  public boolean delete(Long id){
    boolean existsBefore = bookRepository.exists(id);
    if(existsBefore){
      Book book = bookRepository.findOne(id);
      bookRepository.delete(user);
    }
    boolean existsAfter = bookRepository.exists(id);

    return(existsBefore && !existsAfter);

  }

  public Page<Book> findBooks(String search, int page, int size){
    PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.ASC, "price");
    return bookRepository.findAll(search, pageRequest);
  }


}
