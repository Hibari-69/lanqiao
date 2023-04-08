package s.unit3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ip地址检测 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String ip = sc.next();
            try {
                String[] fen = ip.split("\\.");//正则里两个斜杠表示一个转义
                if (fen.length != 4) System.out.println("No");
                else {
                    boolean isextend = false;
                    for (int i = 0; i < fen.length; ++i) {
                        int n = Integer.parseInt(fen[i]);
                        if (n < 0 || n > 255) {
                            isextend = true;
                            break;
                        }
                    }
                    if (!isextend) System.out.println("yes");
                    else System.out.println("No");
                }
            }catch(Exception ex){
                //芜湖try catch 原来大概是这意思
                System.out.println("Wrong");

            }
            //System.out.println(idIP(ip)?"yes":"No");
        }
    }
    public static boolean idIP(String ipAddress){
        String ip="((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";
        Pattern pattern =Pattern.compile(ip);
        Matcher matcher=pattern.matcher(ipAddress);
        return matcher.matches();

    }
}
