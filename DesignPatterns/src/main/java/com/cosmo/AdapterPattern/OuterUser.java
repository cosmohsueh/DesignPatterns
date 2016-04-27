package com.cosmo.AdapterPattern;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("username", "混世魔王");
		baseInfoMap.put("mobileNumber", "它電話是…");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap();
		officeInfoMap.put("jobPosition", "BOSS");
		officeInfoMap.put("officeTelNumber", "公司電話是…");
		return officeInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap();
		homeInfoMap.put("homeTelNumber", "家裡電話是…");
		homeInfoMap.put("homeAddress", "家裡住址是…");
		return homeInfoMap;
	}

}
