package com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.chaoliu1995.DataStructuresAndAlgorithmAnalysis.utils.Consts;

public class Calculator {
	
	private static ArrayList<String> mathOperators;	//存储输入的算数运算符
	
	private static ArrayList<String> elements;	//存储输入的数字
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		print("请输入算式");
		while(true){
			String str = sc.next();
			switch(str){
				case Consts.EXIT:
					sc.close();
					print("退出程序");
					System.exit(0);
				case Consts.HELP:
					printHelp();
					break;
				case Consts.EQUAL_SIGN:
					
					break;
				default:
					parseInput(str);
					break;
			}
		}
		
	}
	
	private static void print(String str){
		System.out.println(str);
	}
	
	private static void printHelp(){
		print(Consts.EXIT+": 退出程序");
		print(Consts.HELP+": 显示帮助信息");
		print(Consts.EQUAL_SIGN+": 计算之前输入的算式");
	}
	
	private static void parseInput(String str){
		
	}
}
