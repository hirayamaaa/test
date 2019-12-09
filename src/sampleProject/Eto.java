package sampleProject;

public class Eto {

  public static void main(String[] args) {
	  String a =  getJikkan(1991);
	  System.out.println(a);
  }

  private static String getJikkan(int year) {
	  jikkan[] values = jikkan.values();
	  int amari = year % 10;
	  for (jikkan value : values) {
		  if (amari == value.ordinal()) {
			  //System.out.println(value);
			  value.toString();
		  }
	  }
	  return "";
  }



  private enum jikkan {
	  庚,
	  辛,
	  壬,
	  癸,
	  甲,
	  乙,
	  丙,
	  丁,
	  戊,
	  己;

  }
}
