package com.rk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private Integer pId;
	private String pCode;
	private String Vendor;
	@OneToMany
	@JoinColumn(name = "pfk")
	private List<Model> mob;
}
