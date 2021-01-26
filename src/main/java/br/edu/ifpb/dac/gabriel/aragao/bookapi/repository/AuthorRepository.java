package br.edu.ifpb.dac.gabriel.aragao.bookapi.repository;

import br.edu.ifpb.dac.gabriel.aragao.bookapi.model.Author;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository implements JpaRepository<Author, Long>{
  
}
