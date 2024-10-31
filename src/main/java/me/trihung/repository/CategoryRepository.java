package me.trihung.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import me.trihung.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Page<Category> findByNameContaining(String keyword, Pageable page);
}
