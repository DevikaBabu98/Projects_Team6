package com.coll;

import java.util.*;
import java.util.Map.Entry;


public class TreeMapEg {

		public static void main(String[] args) {
		
			Map<String, String> tmss = new TreeMap<>();
			
			tmss.put("Karnataka", "Bangalore");
			tmss.put("Tamil Nadu", "Chennai");
			tmss.put("Kerala","Trivandrum");
			
			Set<Entry<String,String>> sess=tmss.entrySet();
			Iterator<Entry<String,String>> iess=sess.iterator();
			
			while(iess.hasNext()) {
				Entry<String,String> ess=iess.next();
				System.out.println(ess.getKey()+"->"+ess.getValue());
			}
			
			for(Entry<String,String> ess:sess) {
				System.out.println(ess.getKey()+"->"+ess.getValue());
			}
		}

}


