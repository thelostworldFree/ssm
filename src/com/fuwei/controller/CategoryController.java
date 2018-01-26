package com.fuwei.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fuwei.pojo.Category;
import com.fuwei.service.CategoryService;
import com.fuwei.util.Page;

// 告诉spring mvc这是一个控制器类
@Component("a")
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;


	@RequestMapping(value = "listCategory", method = RequestMethod.GET )
	public ModelAndView listCategory(Page page){
	
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list(page);
		int total = categoryService.total();

		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
	
	@RequestMapping(value = "addCategory", method = RequestMethod.POST)
	public ModelAndView addCategory(Category category){
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
	    return mav;
	}	
	@RequestMapping(value = "deleteCategory")
	public ModelAndView deleteCategory(Category category){
		categoryService.delete(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category){
		Category c= categoryService.get(category.getT_id());
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}	
	@RequestMapping("putCategory")
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		System.out.println(category+"-------");
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}	

}
