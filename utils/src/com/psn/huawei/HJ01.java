package com.psn.huawei;

import java.util.Scanner;

/**
 *  1.字符串最后一个单词的长度
 *      计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000，字符串末尾不以空格结尾。
 */
public class HJ01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        System.out.println(split[split.length-1].length());
    }
}
