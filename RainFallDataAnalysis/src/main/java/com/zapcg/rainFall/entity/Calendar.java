package com.zapcg.rainFall.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "calender", catalog = "db_rainfallreport")
public class Calendar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "calender_id")
	private Integer calendarId;

	@Column
	private Integer jan;
	@Column
	private Integer fab;
	@Column
	private Integer mar;
	@Column
	private Integer apr;
	@Column
	private Integer may;
	@Column
	private Integer jun;
	@Column
	private Integer jul;
	@Column
	private Integer aug;
	@Column
	private Integer sept;
	@Column
	private Integer oct;
	@Column
	private Integer nov;
	@Column
	private Integer decs;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "year_id2", referencedColumnName = "year_id", insertable = false, updatable = false)
	private Years Years;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "city_id2", referencedColumnName = "city_id", insertable = false, updatable = false)
	private City city;

}
