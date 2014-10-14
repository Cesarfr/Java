package tdd;

public class Roman {
	public int decode(String num){
		String array[]={"I","V","X","L","C","D","M"};
//		for(int i=0; i<num.length(); i++){
//			char ch=num.charAt(i);
//			if(ch!='I' || ch!='V' || ch!='X' || ch!='L' || ch!='C' || ch!='D' || ch!='M' ){
//				return 0;
//			}
//		}
		switch(num){
			case "I":
				return 1;
			case "II":
				return 2;
			case "III":
				return 3;
			case "V":
				return 5;
			case "X":
				return 10;
			case "L":
				return 50;
			case "C":
				return 100;
			case "D":
				return 500;
			case "M":
				return 1000;
			default:
				return 0;
		}
	}
}
