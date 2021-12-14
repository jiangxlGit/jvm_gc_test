package com.jloved.jvmgc.test;

import java.util.Scanner;

/**
 * @author jiangxl
 * @version V1.0
 * @Description 测试jvm gc
 * @ClassName JvmGCTest
 * @Date 2021/12/14 15:03
 */
public class JvmGCTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入数字1: ");
    if (scan.hasNextInt()) {
      if (scan.nextInt() == 1) {
        byte[] array1 = new byte[4 * 1024 * 1024];
        array1 = null;
        System.out.println("请输入数字2: ");
        if (scan.nextInt() == 2) {
          byte[] array2 = new byte[2 * 1024 * 1024];
          byte[] array3 = new byte[2 * 1024 * 1024];
          byte[] array4 = new byte[2 * 1024 * 1024];
        }
        System.out.println("请输入数字3: ");
        if (scan.nextInt() == 3) {
          byte[] array5 = new byte[128 * 1024];
        }
        System.out.println("请输入数字4: ");
        if (scan.nextInt() == 4) {
          byte[] array6 = new byte[2 * 1024 * 1024];
        }
        while (true) {
          System.out.println("请输入数字5: ");
          if (scan.nextInt() == 5) {
            byte[] array7 = new byte[2 * 1024 * 1024];
            array7 = null;
          }
        }
      }
    }
  }


}
