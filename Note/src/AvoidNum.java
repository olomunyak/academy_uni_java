
public class AvoidNum {

	public static void main(String[] args) {
		
//		String[] avoidNum = {"3", "6", "9"};
//		String sNum;
//		String[] sANum = null;
//		int lastNum = 100;
//		int count = 0;
//		
//		for(int i = 1 ; i <= lastNum ; i++) {
//			
//			sNum = Integer.toString(i);
//			
//			for(int h = 1 ; h <= sNum.length() ; h++) {
//				
//				sANum = new String[sNum.length()];
//				sANum[h] = sNum.substring(h-1,h); 
//			}
//			
//			for(int j = 0 ; j < sANum.length; j++) {
//				
//				for(int k = 0 ; k < avoidNum.length; k++) {
//					
//					if(sANum[j] == avoidNum[k]) {
//						
//						count++;
//					}
//				}
//			}
//			
//			if(count == 0) {
//				System.out.print(i + ", ");
//			} else {
//				count = 0;
//			}
//			
//			sANum = null;
//		}

		
//		for(int i = 1 ; i <= 1000 ; i++) {
//			String tmp = Integer.toString(i);
//			if(tmp.indexOf("3") == -1 &&
//			   tmp.indexOf("6") == -1 &&
//			   tmp.indexOf("9") == -1) {
//				System.out.println(tmp);
//			}
//		}

		
		for(int i = 1 ; i <= 500 ; i++) {
			String tmp = Integer.toString(i);
			
			boolean flag = true;
			for(int j = 1 ; j <= tmp.length() ; j++) {
				String c = tmp.substring(j-1, j);
				if(c.equals("3") || c.equals("6") || c.equals("9")) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(tmp);
			}
		}

	}

}
