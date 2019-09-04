package com.StudySiteZ.Access.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudySiteZ.Entity.ItemEntity;

@Repository
public interface ItemListRepository extends JpaRepository<ItemEntity,Integer>{

}
