package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(exclude = "password")
@Entity
@Table(name = "hospitals")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 40)
	private String name;

	@Column(length = 30 , unique=true)
	private String email;

	@Column(length = 16)
	private String password;
	
	@Column(name = "contactNo" ,length=13)
	private String contactNumber;

	@Column(length = 30)
	private String city;

	@Column(length = 30)
	private String state;

	@Column( name="covidTreatment",length = 20)
	@Enumerated(EnumType.STRING)
	private CovidTreatment status;


    private int totalNormalBeds;

	private int occupiedNormalBeds;

	private int totalOxygenBeds;

	private int occupiedOxygenBeds;

	@Column(name = "total_ICU_Beds")
	private int totalICUBeds;

	@Column(name = "occupied_ICU_Beds")
	private int occupiedICUBeds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CovidTreatment getStatus() {
		return status;
	}

	public void setStatus(CovidTreatment status) {
		this.status = status;
	}

	public int getTotalNormalBeds() {
		return totalNormalBeds;
	}

	public void setTotalNormalBeds(int totalNormalBeds) {
		this.totalNormalBeds = totalNormalBeds;
	}

	public int getOccupiedNormalBeds() {
		return occupiedNormalBeds;
	}

	public void setOccupiedNormalBeds(int occupiedNormalBeds) {
		this.occupiedNormalBeds = occupiedNormalBeds;
	}

	public int getTotalOxygenBeds() {
		return totalOxygenBeds;
	}

	public void setTotalOxygenBeds(int totalOxygenBeds) {
		this.totalOxygenBeds = totalOxygenBeds;
	}

	public int getOccupiedOxygenBeds() {
		return occupiedOxygenBeds;
	}

	public void setOccupiedOxygenBeds(int occupiedOxygenBeds) {
		this.occupiedOxygenBeds = occupiedOxygenBeds;
	}

	public int getTotalICUBeds() {
		return totalICUBeds;
	}

	public void setTotalICUBeds(int totalICUBeds) {
		this.totalICUBeds = totalICUBeds;
	}

	public int getOccupiedICUBeds() {
		return occupiedICUBeds;
	}

	public void setOccupiedICUBeds(int occupiedICUBeds) {
		this.occupiedICUBeds = occupiedICUBeds;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", city=" + city + ", state=" + state + ", status=" + status
				+ ", totalNormalBeds=" + totalNormalBeds + ", occupiedNormalBeds=" + occupiedNormalBeds
				+ ", totalOxygenBeds=" + totalOxygenBeds + ", occupiedOxygenBeds=" + occupiedOxygenBeds
				+ ", totalICUBeds=" + totalICUBeds + ", occupiedICUBeds=" + occupiedICUBeds + "]";
	}


	
	
	}
