package com.example.shoppingmallspring.domain.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
