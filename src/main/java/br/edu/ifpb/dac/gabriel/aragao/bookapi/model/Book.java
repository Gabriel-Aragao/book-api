package br.edu.ifpb.dac.gabriel.aragao.bookapi.model;


import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book")
public class Book implements Serializable{

  private static final long serialVersionUID = 1L;

  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private String subtitle;

  @OneToMany(mappedBy="book")
  private List<Author> authors;
  private int year;
  private double price;

}
