package com.william;


import java.io.Serializable;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
 
 
@Entity
public class Category implements Serializable {
 
    //private long id;
    private long categoryId;
    /**
	 * @return the categoryId
	 */
    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
	public long getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	private String name;
 
    private Set<Product> products;
 
    public Category() {
    }
 
    public Category(String name) {
        this.name = name;
    }
 /*
    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }
 */
 
    @OneToMany(mappedBy = "category",cascade=CascadeType.ALL, orphanRemoval = true)
    public Set<Product> getProducts() {
        return products;
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id the id to set
	 */
	/*public void setId(long id) {
		this.id = id;
	}*/

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
 
    // other getters and setters
    
}
