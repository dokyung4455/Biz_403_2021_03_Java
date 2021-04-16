package com.dokyung.black.model;

public class CardVO {
	
	private Integer playerScore;
	private Integer dealerScore;
	private String playerCard;
	private String dealerCard;
	private String cardDeck;
	public String getCardDeck() {
		return cardDeck;
	}
	public void setCardDeck(String cardDeck) {
		this.cardDeck = cardDeck;
	}
	public Integer getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(Integer playerScore) {
		this.playerScore = playerScore;
	}
	public Integer getDealerScore() {
		return dealerScore;
	}
	public void setDealerScore(Integer dealerScore) {
		this.dealerScore = dealerScore;
	}
	public String getPlayerCard() {
		return playerCard;
	}
	public void setPlayerCard(String playerCard) {
		this.playerCard = playerCard;
	}
	public String getDealerCard() {
		return dealerCard;
	}
	public void setDealerCard(String dealerCard) {
		this.dealerCard = dealerCard;
	}
	@Override
	public String toString() {
		return "CardVO [playerScore=" + playerScore + ", dealerScore=" + dealerScore + ", playerCard=" + playerCard
				+ ", dealerCard=" + dealerCard + ", cardDeck=" + cardDeck + ", getCardDeck()=" + getCardDeck()
				+ ", getPlayerScore()=" + getPlayerScore() + ", getDealerScore()=" + getDealerScore()
				+ ", getPlayerCard()=" + getPlayerCard() + ", getDealerCard()=" + getDealerCard() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
