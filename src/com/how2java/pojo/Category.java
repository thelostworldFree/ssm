package com.how2java.pojo;
 
public class Category {
	private int t_id;
	private String name;
	private String words;
	private String types;
	private String exist;

	
	public int getT_id() {
		return t_id;
	}


	public void setT_id(int t_id) {
		this.t_id = t_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWords() {
		return words;
	}


	public void setWords(String words) {
		this.words = words;
	}


	public String getTypes() {
		return types;
	}


	public void setTypes(String types) {
		this.types = types;
	}


	public String getExist() {
		return exist;
	}


	public void setExist(String exist) {
		this.exist = exist;
	}


	@Override
	public String toString() {
		return "Category [t_id=" + t_id + ", name=" + name + ", words=" + words + ", types=" + types + ", exist="
				+ exist + "]";
	}
	
}