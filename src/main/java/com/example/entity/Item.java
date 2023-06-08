package com.example.entity;

import java.time.LocalDateTime;

public class Item {

	private Integer id;

	private String name;

	private Integer price;

	private Integer stock;

	private Integer categoryId;

	private LocalDateTime deleteAt;

	public LocalDateTime getDeleteAt() {
		return deleteAt;
	}
	public void setDeleteAt(LocalDateTime deleteAt) {
		this.deleteAt = deleteAt;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}


}
