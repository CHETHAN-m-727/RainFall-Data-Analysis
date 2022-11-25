package com.zapcg.rainFall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "years", catalog = "db_rainfallreport")
public class Years {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "year_id")
	private Integer year_id;
	@Column(name = "year")
	private Integer year;

}
