package br.edu.ifpb.dac.gabriel.aragao.bookapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsCOnstructor
public class Book {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private String subtitle;

  //TODO Create Relationship
  private Author author;
  private int year;
  private double price;

}