package com.william;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

import org.hibernate.Query;
import org.hibernate.Session;
//import org.hibernate.mapping.List;
 
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        //add your data manipulation here
        /*Category category = new Category();
        
        category.setCategoryId(1);
        category.setName("Sport");
        session.save(category);*/
        
        /*Product prod1 = new Product();
        //prod1.setId(1);
        prod1.setDescription("shorts are red");
        prod1.setName("Shorts");
        prod1.setCategory(category);
        prod1.setPrice((float)11.99);
        
        Product prod2 = new Product();
        //prod1.setId(1);
        prod2.setDescription("socks are blue");
        prod2.setName("Socks");
        prod2.setCategory(category);
        prod2.setPrice((float)5.99);

        //category.setCreatedDate(new Date());
        session.save(prod1);
        session.save(prod2);*/
        
        /*String hql = "from Category";
        Query query = session.createQuery(hql);
        List<Category> listCategories = query.list();
         
        for (Category aCategory : listCategories) {
            System.out.println(aCategory.getName());
        }*/

        //the below gets you only the Product List. It has a Product at each index posn. 
        String hql = "from Product where category.name = 'Sport'";
        Query query = session.createQuery(hql);
        List<Product> listProducts = query.list();
         
        for (Product aProduct : listProducts) {
            System.out.println(aProduct.getName()+ " " +aProduct.getDescription()
            				+ " " +aProduct.getPrice()+ " " +aProduct.getCategory().getName());
        }  
        /*
        String hql = "from Product where description like :keyword";
        
        String keyword = "blue";
        Query query = session.createQuery(hql);
        query.setParameter("keyword", "%" + keyword + "%");
         
        List<Product> listProducts = query.list();
         
        for (Product aProduct : listProducts) {
            System.out.println(aProduct.getName()+ " " +aProduct.getDescription()
			+ " " +aProduct.getPrice()+ " " +aProduct.getCategory().getName());
        } */     
        
        /*String hql = "update Product set price = :price where id = :id";
        
        Query query = session.createQuery(hql);
        query.setParameter("price", 6.00f);
        query.setParameter("id", 2l);
         
        int rowsAffected = query.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Updated " + rowsAffected + " rows.");
        }*/
        
        /*String hql = "delete from Category where categoryId = :catId";
        
        Query query = session.createQuery(hql);
        query.setParameter("catId", new Long(1));
         
        int rowsAffected = query.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Deleted " + rowsAffected + " rows.");
        }*/

        //the below gets you both the Product and Category attributes in their objects. 
        /*String hql = "from Product p inner join p.category";
        
        Query query = session.createQuery(hql);

        List<Object[]> listResult = query.list();
         
        for (Object[] aRow : listResult) {
            Product product = (Product) aRow[0];
            Category category = (Category) aRow[1];
            System.out.println(product.getName() + " - " + product.getDescription() + " - " + category.getName());
        }*/
        
        session.getTransaction().commit();
        session.close();

    }
 
}