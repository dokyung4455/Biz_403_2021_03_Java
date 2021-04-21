package com.dokyung.card.model;

public class DealerVO {
	
	private Integer score;
	private String Card;
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getCard() {
		return Card;
	}
	public void setCard(String card) {
		Card = card;
	}
	@Override
	public String toString() {
		return "PlayerVO [score=" + score + ", Card=" + Card + "]";
	}

	

}
