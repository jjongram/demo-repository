package kr.co.self02;

public class self {

	public static void main(String[] args) {
	       Class03[] menu = new Class03[3];
	       
	       for (int a = 0; a < menu.length; a++) {
	          menu[a] = new Class03();
	       }
//
//	       menu[0].menuName = "돈까스";
//	       menu[0].menuPrice = 7000;
//
//	       menu[1].menuName = "제육덮밥";
//	       menu[1].menuPrice = 9000;
//
//	       menu[2].menuName = "라면";
//	       menu[2].menuPrice = 4500;
//
	       for (int b = 0; b < menu.length; b++) {
	      menu[b].allMenu();
	       }
	}
}


