package com.example.demo.service;

import java.util.Optional;

public interface PersistableService<E> {
	
	void save(E e);
	Optional<E> retrieveOne(int id);
	void delete(E e);

}
