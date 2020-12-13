package com.example.CoffieWebApi.model;

import javax.persistence.*;

@Entity
public class ViewOrder {
	
	public ViewOrder() {}
	
	
	
	public ViewOrder(Integer id, Integer qty, Integer pid) {
		super();
		this.id = id;
		this.qty = qty;
		this.pid = pid;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer qty;
	
	private Integer pid;

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getQty() {
		return qty;
	}



	public void setQty(Integer qty) {
		this.qty = qty;
	}



	public Integer getPid() {
		return pid;
	}



	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	
	
	
}
