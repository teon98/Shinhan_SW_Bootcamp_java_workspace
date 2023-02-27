package com.shinhan.day05;

public class Speaker implements Volume{
	
	int VolLevel = 0;
	
	public Speaker() {}

	@Override
	public void volumeUp(int level) {
		if(VolLevel+level > 100) {
			this.VolLevel = 100;
		}else {
			this.VolLevel += level;
		}
		
		System.out.println(getClass().getSimpleName() + "볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		if(VolLevel - level < 0) {
			VolLevel = 0;
		}else {
			VolLevel -= level;
		}
		
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다." + VolLevel);
		
	}

}
