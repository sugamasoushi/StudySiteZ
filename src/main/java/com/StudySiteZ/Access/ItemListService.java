package com.StudySiteZ.Access;

import java.util.List;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudySiteZ.Entity.ItemEntity;
import com.StudySiteZ.Entity.LoginUserEntity;
import com.StudySiteZ.Access.Repository.ServiceRepositories;

@Service
public class ItemListService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private ServiceRepositories ServiceRepositories;
	
	@SuppressWarnings("unchecked")
	public List<ItemEntity>getAll(){
		return (List<ItemEntity>)entityManager.createQuery("from ItemEntity").getResultList();
	}
	
	public ItemEntity getItemDetails(int num) {
		return (ItemEntity)entityManager.createQuery("from ItemEntity where id = " + num).getSingleResult();
	}

	
	
	
	
	public List<ItemEntity>find(String fstr){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ItemEntity>query = builder.createQuery(ItemEntity.class);
		Root<ItemEntity>root = query.from(ItemEntity.class);
		query.select(root).where(builder.equal(root.get("id"), fstr));
		List<ItemEntity>list = null;
		list = (List<ItemEntity>)entityManager.createQuery(query).getResultList();
		return list;
	}
	
}
