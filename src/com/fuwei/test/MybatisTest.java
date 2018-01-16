package com.fuwei.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fuwei.mapper.CategoryMapper;
import com.fuwei.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private CategoryMapper categoryMapper;


	@Before
	public void setup() {
//		List<Category> cs= categoryMapper.list();
//		for (Category c : cs) {
//			categoryMapper.delete(c.getId());
//		}
//		for (int i = 0; i < 1; i++) {
//			Category category = new Category();
//			category.setName("new Category" + i);
//			categoryMapper.add(category);
//		}
	}

	@Test
	public void updateProduct(){
		Category c= categoryMapper.get(22);
//		for (int i = 0; i < 100; i++) {
//			Product p = new Product();
//			p.setName("product"+i);
//			p.setPrice(i);
//			p.setCategory(c);
//			productMapper.add(p);
//		}
		
//		Page page = new Page();
//		page.setStart(5);
//		page.setCount(5);
		
//		Map m = new HashMap();
//		m.put("category", c);
//		m.put("page", page);
//		List<Product> ps= productMapper.list(m);
//		
//		for (Product p : ps) {
//			System.out.println(p);
//		}
		
		
	}	
	
//	@Test
//	public void testTotal() {
//		int total = categoryMapper.total();
//		System.out.println(total);
//	}
//
//	@Test
//	public void testList() {
//		Page p = new Page();
//		p.setStart(2);
//		p.setCount(3);
//		List<Category> cs=categoryMapper.list(p);
//		for (Category c : cs) {
//			System.out.println(c.getName());
//		}
//	}

}
