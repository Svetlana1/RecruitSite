package demo.webtasks.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

////class System {
////	static System out = new System();
////
////	public static void println(String str) {
////		java.lang.System.out.println("Good");
////	}
////}
//
public class Main {
	// // private class String{
	// //
	// // }
	// static{
	// PrintStream out=new PrintStream(System.out){
	// public void println(String str) {
	// // TODO Auto-generated method stub
	// super.println("Bey");
	// }
	// };
	//
	// }
	// //
	// // public static void main(String[] args) throws ParseException {
	// // // EmailException, NoSuchAlgorithmException {
	// // // System.out.println(sha1("test string to sha1"));
	// //
	// //// SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	// //// String date = sdf.format(new Date());
	// //// System.out.println(date);
	// // System.out.println("ef");
	// // }
	//
	//
	// public static void main(java.lang.String[] args) {
	//
	// // EmailException, NoSuchAlgorithmException {
	// // System.out.println(sha1("test string to sha1"));
	//
	// // SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	// // String date = sdf.format(new Date());
	// // System.out.println(date);
	// System.out.println("ef");
	// }
	//
	// static String sha1(String input) throws NoSuchAlgorithmException {
	// MessageDigest mDigest = MessageDigest.getInstance("SHA1");
	// byte[] result = mDigest.digest(input.getBytes());
	// StringBuffer sb = new StringBuffer();
	// for (int i = 0; i < result.length; i++) {
	// sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16)
	// .substring(1));
	// }
	//
	// return sb.toString();
	//
	// }

	
	
	public static void main(String[] args) {
		 try { 
	            ArrayList<Integer> ar = new ArrayList<Integer>(); 
	            List temp = ar; //1 
	            temp.add(new java.util.Date()); //2 
	            temp.add(new Float(1.66)); 
	            Iterator it = ar.iterator(); 
	            while (it.hasNext()) 
	                System.out.println(it.next()); 
	            System.out.println(ar.get(0)); 
	        } catch (Exception e) { 
	            System.out.println(e.getClass()); 
	        } 
	}

}
