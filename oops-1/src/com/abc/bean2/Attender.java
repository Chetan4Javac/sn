package com.abc.bean2;

import com.abc.bean.Person;

public class Attender extends Person {

	void m1() {
		Attender a = new Attender();
		System.out.println(a.myProtectedField);
	}

}
