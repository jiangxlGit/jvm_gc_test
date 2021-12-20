package com.jloved.jvmgc.test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

/**
 * @author jiangxl
 * @version V1.0
 * @Description 测试jvm gc
 * @ClassName JvmGCTest
 * @Date 2021/12/14 15:03
 */
public class JvmGCTest {

  public static void main(String[] args) {

    // 启动项目，新生代内存消耗4M左右
    System.out.println("\n\r1、================");
    byte[] array1 = new byte[4 * 1024 * 1024];
    array1 = null;
    prinfMemInfo();

    System.out.println("\n\r2、================");
    byte[] array2 = new byte[2 * 1024 * 1024];
    byte[] array3 = new byte[2 * 1024 * 1024];
    prinfMemInfo();

    System.out.println("\n\r3、================");
    byte[] array4 = new byte[2 * 1024 * 1024];
    byte[] array5 = new byte[1 * 512 * 1024];
    prinfMemInfo();

    System.out.println("\n\r4、================");
    byte[] array6 = new byte[2 * 1024 * 1024];
    prinfMemInfo();

    System.out.println("\n\r5、================");
    byte[] array7 = new byte[2 * 1024 * 1024];
    array7 = null;
    prinfMemInfo();

  }

  private static void prinfMemInfo() {
    ManagementFactory.getMemoryPoolMXBeans().stream().forEach(memoryPoolMXBean -> {
      System.out.println(
          memoryPoolMXBean.getName() + "  总量:" + memoryPoolMXBean.getUsage().getCommitted()
              + "   使用的内存:" + memoryPoolMXBean.getUsage().getUsed());
    });
  }

}
