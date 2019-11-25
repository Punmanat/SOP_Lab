package com.patrick.sop.workshop1.Repository;

import com.patrick.sop.workshop1.Entity.Book;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	Book findById(int id);
}
