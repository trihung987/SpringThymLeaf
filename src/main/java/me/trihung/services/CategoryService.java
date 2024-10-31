package me.trihung.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import me.trihung.entity.Category;

public interface CategoryService {

	void deleteById(Long id);
	
	long count();
	
	<S extends Category> S save(S entity);

	Optional<Category> findById(Long id);

	List<Category> findAll(Sort sort);

	Page<Category> findAll(Pageable pageable);

	List<Category> findAll();

	Page<Category> findByNameContaining(String keyword, Pageable page) ;	
	
}
