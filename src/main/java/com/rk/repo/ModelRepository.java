package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>{

}
