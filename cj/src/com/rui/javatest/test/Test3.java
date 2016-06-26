package com.rui.javatest.test;

import com.rui.javatest.entity.Person;

public class Test3 {
	public static void main(String[] args) {
		Person[] in=new Person[5];
		for (int i = 0; i < in.length; i++) {
			in[i]=new Person();
			in[i].setAge(0);
		//	in[i].setName(null);
			if("name"==in[i].getName()){
				System.out.println(i);
			}else{
				System.out.println(i+1);
			}
			System.out.println(in[i].getAge());
		}
		
		
	}

}
