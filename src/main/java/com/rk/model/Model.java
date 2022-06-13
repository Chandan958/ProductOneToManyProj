package com.rk.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	@Id
	private Integer mId;
	private String mCode;
	private String mColor;
	private Double mCost;

}
