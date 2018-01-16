package com.fuwei.service;

import java.util.List;

import com.fuwei.pojo.Category;
import com.fuwei.util.Page;

public interface CategoryService {

	List<Category> list();
	int total();
	List<Category> list(Page page);
	void add(Category c);
	void update(Category c);
	void delete(Category c);
	Category get(int tid);

}
