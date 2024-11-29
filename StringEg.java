package com.cmap;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This ,is,to,test";
		int index=str.indexOf(",");
		String substr=str.substring(0,index);
		System.out.println(substr);
		
		int lindex=str.lastIndexOf(",");
		System.out.println(str.substring(lindex+1));
		
		//use String's split() to tokenize given string
		str.split(substr);
	}

}
