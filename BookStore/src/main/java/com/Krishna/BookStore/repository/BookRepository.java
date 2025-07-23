package com.Krishna.BookStore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Krishna.BookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}