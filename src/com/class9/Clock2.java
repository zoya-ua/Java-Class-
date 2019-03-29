package com.class9;

public class Clock2 {

	public static void main(String[] args) {
		// 24 hours, 60 min

		for (int i = 0; i <= 24; i++) {
			if(i<10) {
				for (int y = 0; y <= 60; y++) {
					
					if (y < 10) {
						System.out.println("0"+i + ":0" + y);
					} else {

						System.out.println("0"+i + ":" + y);
					}
				
				
			}} else {
				
			}
			for (int y = 0; y <= 60; y++) {
				
				if (y < 10) {
					System.out.println(i + ":0" + y);
				} else {

					System.out.println(i + ":" + y);
				}
			}
		}
	}

}
