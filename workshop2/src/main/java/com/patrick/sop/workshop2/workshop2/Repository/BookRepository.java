package com.patrick.sop.workshop2.workshop2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.patrick.sop.workshop2.workshop2.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}

