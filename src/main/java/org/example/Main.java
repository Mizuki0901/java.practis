package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("配列の要素数を入力してください");
    int size = scanner.nextInt();

    int[] numbers = new int[size];
    for (int i = 0 ; i < size ; i++){
      System.out.println((i + 1) + "番目の数字を入れてください");
      numbers[i] = scanner.nextInt();
    }
    int sum = Arrays.stream(numbers).sum();
    double average = (double) sum / size;
    int max = Arrays.stream(numbers).max().getAsInt();
    int min = Arrays.stream(numbers).min().getAsInt();

    System.out.println("合計:" + sum);
    System.out.println("平均:" + average);
    System.out.println("最大値:" + max);
    System.out.println("最小値:" + min);
  }
}
