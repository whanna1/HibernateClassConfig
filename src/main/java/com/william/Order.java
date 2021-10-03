package com.william;


import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity
public class Order implements Serializable {
    private int id;
    private String customerName;
    private Date purchaseDate;
    private float amount;
    private Product product;
 
    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    @Column(name = "CUSTOMER_NAME")
    public String getCustomerName() {
        return customerName;
    }
 
    @Column(name = "PURCHASE_DATE")
    @Temporal(TemporalType.DATE)
    public Date getPurchaseDate() {
        return purchaseDate;
    }
 
 
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
 
    // other getters and setters
    
}