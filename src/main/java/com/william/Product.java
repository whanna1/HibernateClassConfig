package com.william;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
public class Product implements Serializable {
    private long id;
    private String name;
    private String description;
    private float price;
    private Category category;
 
    public Product() {
    }
 
    public Product(String name, String description, float price,
            Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }
 
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue
    public long getId() {
        return id;
    }

    //@JoinColumn(name = "CATEGORY_ID")	//indicates FK field in child Table
   @ManyToOne
   //@JoinColumn(name = "categoryId")	//names FK field in child Table
    public Category getCategory() {
        return category;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
 
    // other getters and setters
    
}