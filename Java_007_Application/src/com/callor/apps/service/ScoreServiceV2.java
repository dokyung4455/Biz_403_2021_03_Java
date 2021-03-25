package com.callor.apps.service;

public class ScoreServiceV2 extends ScoreServiceV1{
	
	int[] intKors;
	int[] intEngs;
	int[] intMaths;
	int[] intSums;
	float[] floatAvg;
	
	public ScoreServiceV2(int members) {
		intKors = new int[members];
		intEngs = new int[intKors.length];
		intMaths = new int[intKors.length];
		intSums = new int[intKors.length];
		floatAvg = new float[intKors.length];
		
	}
	
	
	
}
