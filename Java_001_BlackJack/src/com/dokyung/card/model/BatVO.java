package com.dokyung.card.model;

public class BatVO {
	
	Integer onCoin;
	Integer playerCoin;
	public BatVO() {
		// TODO Auto-generated constructor stub
		playerCoin = 100000;
	}

	public Integer getPlayerCoin() {
		return playerCoin;
	}

	public void setPlayerCoin(Integer playerCoin) {
		
		this.playerCoin = playerCoin;
	}

	public Integer getOnCoin() {
		return onCoin;
	}

	public void setOnCoin(Integer onCoin) {
		this.onCoin = onCoin;
	}

}
