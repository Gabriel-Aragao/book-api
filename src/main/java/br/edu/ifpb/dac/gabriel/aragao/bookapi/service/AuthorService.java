package br.edu.ifpb.dac.gabriel.aragao.bookapi.service;

import br.edu.ifpb.dac.gabriel.aragao.model.Author;
import br.edu.ifpb.dac.gabriel.aragao.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class AuthorService {

  @Autowired
  private AuthorRepository authorRepository;

  public save(Author author){
    return authorRepository.save(author);
  }

}
