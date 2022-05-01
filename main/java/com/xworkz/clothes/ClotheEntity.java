package com.xworkz.clothes;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="clothe_table")
public class ClotheEntity {
	
	

	@Id
	@Column(name="clotheId")
	private int clotheId;
	
	public int getClotheId() {
		return clotheId;
	}
	public void setClotheId(int clotheId) {
		clotheId = clotheId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getManifacturedYear() {
		return manifacturedYear;
	}
	public void setManifacturedYear(Date manifacturedYear) {
		this.manifacturedYear = manifacturedYear;
	}
	@Column(name = "brand")
	private String brand;
	@Column(name = "price")
	private int price;
	@Column(name = "manifacturedYear")
	private Date manifacturedYear;
	
	
	@Override
	public String toString() {
		return "ClotheEntity [clotheId=" + clotheId + ", brand=" + brand + ", price=" + price + ", manifacturedYear="
				+ manifacturedYear + "]";
	}
	   
	}

