//Comparing File objects using hashcode example

package com.nostalgiaguy.coreconceptpage2;

import java.io.File;

public class IdentityHashCode {

    public static void main(String[] argv) throws Exception {

  File file11 = new File("G:/MY_DOWNLOADS/SKYPE/response.txt");

  File file22 = new File("G:/MY_DOWNLOADS/SKYPE/server.txt");

  int ihc1 = System.identityHashCode(file11);

  System.out.println(ihc1);

  int ihc2 = System.identityHashCode(file22);

  System.out.println(ihc2);
  

  File file1 = new File("f1");

  File file2 = new File("f2");

  File file3 = new File("f3");


  int hc1 = file1.hashCode();

  System.out.println(hc1);

  int hc2 = file2.hashCode();

  System.out.println(hc2);

  int hc3 = file3.hashCode();

  System.out.println(hc3);

    }
}
