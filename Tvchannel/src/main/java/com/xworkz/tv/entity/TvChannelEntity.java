package com.xworkz.tv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tv_channel")
public class TvChannelEntity {

	@Id
	@Column(name = "channelId")
	private int channelId;
	@Override
	
	public String toString() {
		return "TvChannelEntity [channelId=" + channelId + ", channelName=" + channelName + ", price=" + price + "]";
	}

	@Column(name = "channelName")
	private String channelName;
	@Column(name = "price")
	private int price;

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
