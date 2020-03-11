package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        String[] parts=line.split("/");
        System.out.println(("Day:" + Integer.parseInt(parts[0]) + " " + "Month:" + Integer.parseInt(parts[1]) + " " + "Year:" + Integer.parseInt(parts[2])));

    }
}
