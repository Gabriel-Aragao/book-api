package br.edu.ifpb.dac.gabriel.aragao.bookapi.repository;

import br.edu.ifpb.dac.gabriel.aragao.bookapi.model.Book;
import br.edu.ifpb.dac.gabriel.aragao.bookapi.model.Author;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository implements JpaRepository<Book, Long>{
  
  Page<Author> FindAll(String search, Pageable pageable);
}
