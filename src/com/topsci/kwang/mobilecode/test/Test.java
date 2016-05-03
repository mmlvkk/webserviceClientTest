package com.topsci.kwang.mobilecode.test;

import com.topsci.kwang.mobilecode.MobileCodeWS;
import com.topsci.kwang.mobilecode.MobileCodeWSSoap;

public class Test {
	
	public static void main(String[] args) throws Exception {
		MobileCodeWSSoap soap = new MobileCodeWS().getMobileCodeWSSoap();
		
		System.out.println(soap.getMobileCodeInfo("13785227176",""));
		
		
		
	}

}
