package test.ez;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lc2351 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> hash=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(!hash.add(ch)){
                System.out.println(ch);
            }
        }
    }

}

/*
感觉这样好简洁我c.
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[26];
        char[] x = s.toCharArray();
        for (char i : x) {
            if (++a[i - 'a'] == 2) {
                System.out.println(i);
                return;
            }
        }
    }

    */

/*
这样平台AC没过55;可能下面再写一个遍历桶才行
static int [] a=new int[26];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {

            a[s.charAt(i)-'a']++;
            if(a[s.charAt(i)-'a']==2){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
*/
