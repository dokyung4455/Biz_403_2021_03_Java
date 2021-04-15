package com.dokyung.black.model;

public class BlackVO {
	
	private Integer dealerScore = 0;
	private String dealerCard;
	private Integer playerScore = 0;
	private String playerCard;
	
	public Integer getDealerScore() {
		return dealerScore;
	}
	public void setDealerScore(Integer dealerScore) {
		this.dealerScore = dealerScore;
	}
	public String getDealerCard() {
		return dealerCard;
	}
	public void setDealerCard(String dealerCard) {
		this.dealerCard = dealerCard;
	}
	public Integer getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(Integer playerScore) {
		this.playerScore = playerScore;
	}
	public String getPlayerCard() {
		return playerCard;
	}
	public void setPlayerCard(String playerCard) {
		this.playerCard = playerCard;
	}

}
