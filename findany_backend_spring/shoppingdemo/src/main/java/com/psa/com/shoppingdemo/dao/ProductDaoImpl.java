package com.psa.com.shoppingdemo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psa.com.shoppingdemo.entity.Product;

/**
 * @author KIRANKUMAR NARARE
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {

	private EntityManager entityManager;
	
	@Autowired
	public void ProductDaoHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	public List<Product> findAll() {
		Session currentSession= entityManager.unwrap(Session.class);
		Query<Product> theQuery= currentSession.createQuery("from Product", Product.class);		
		List<Product> menu=theQuery.getResultList();
		return menu;
	}

	@Override
	public Product findByProductId(int prodId) {
		
		Session currentSession = entityManager.unwrap(Session.class);		
		Product product=currentSession.get(Product.class, prodId);
		return product;
		
	}

	@Override
	public void save(Product product) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(product);
		
		
	}

	@Override
	public void removeByProductId(int prodId) {

		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from Product where prodId=:prodId");
		theQuery.setParameter("prodId",prodId);
		
		
		theQuery.executeUpdate();
		
	}

}
