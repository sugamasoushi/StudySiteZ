package com.StudySiteZ.Access.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudySiteZ.Entity.CartEntity;

@Repository
public interface ServiceRepositories extends JpaRepository<CartEntity,String>{

}
