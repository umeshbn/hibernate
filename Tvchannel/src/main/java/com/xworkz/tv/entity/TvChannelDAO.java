package com.xworkz.tv.entity;

public interface TvChannelDAO {
	
	public void save(TvChannelEntity channelEntity);
	public TvChannelEntity getbyId(Integer channelId);
	public void upadate(Integer price,Integer channelId);
	public void deleteById(Integer ChannelId);

}
