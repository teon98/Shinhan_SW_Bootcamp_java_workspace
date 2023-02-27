package com.shinhan.day05;

public class TV implements Volume{

	int VolLevel=0;
	
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		if(VolLevel - level <0) {
			VolLevel = 0;
		}else {
			VolLevel -= level;
		}
		
			
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + VolLevel);
		
	}

}
