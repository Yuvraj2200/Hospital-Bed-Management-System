package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude="password")
@Entity
@Table(name = "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(length = 40)
	private String name;
	
	@Column(length = 30 , unique=true)
    private String email;
	
	@Column(length = 30)
	private String password;
	
	@Column(name = "contactNo" ,length=13)
	private String contactNumber;
	
	@Column(length = 30)
	private String gender;
	
	
	@Column(length = 30)
    private String city;
	
	@Column(length = 30)
    private String state;

	@Column(name="pin")
	private int pincode;
	
	@Column(name="CovidStatus",length = 10)
	@Enumerated(EnumType.STRING)
	private CovidStatus status;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="hospitalId" , nullable=true)
	public Hospital hospital;
	
	@Column(name="bedType")
	public String bedType;
	
	@Transient
	@OneToOne(cascade = CascadeType.ALL)
	public Enquiry enquiry;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public CovidStatus getStatus() {
		return status;
	}

	public void setStatus(CovidStatus status) {
		this.status = status;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", gender=" + gender + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", status=" + status + ", hospital=" + hospital + ", bedType=" + bedType
				+ ", enquiry=" + enquiry + "]";
	}
	
	
	
	
}
