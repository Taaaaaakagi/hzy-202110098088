package git;

import java.util.ArrayList;
import java.util.Scanner;
public interface ISignUp {
    public void print();
    public boolean addStudent (Integer stuType);
    public static IParams parse() throws Exception{           //分析字符串
        final Scanner reader = new Scanner(System.in);
        System.out.print("大班名额：");
        SchoolSystem._big = reader.nextInt();
        System.out.print("中班名额：");
        SchoolSystem._medium = reader.nextInt();
        System.out.print("小班名额：");
        SchoolSystem._small = reader.nextInt();
        IParams ip = new IParams() {
            public int getBig() {
                return SchoolSystem._big;
            }

            public int getMedium() {
                return SchoolSystem._medium;
            }

            public int getSmall() {
                return SchoolSystem._small;
            }

            public ArrayList<Integer> getPlanSignUp() {
                ArrayList<Integer> input = new ArrayList();
                System.out.print("进入班级：");
                Integer a = reader.nextInt();
                input.add(a);
                System.out.print("进入班级：");
                Integer b = reader.nextInt();
                input.add(b);
                System.out.print("进入班级：");
                Integer c = reader.nextInt();
                input.add(c);
                System.out.print("进入班级：");
                Integer d = reader.nextInt();
                input.add(d);
                return input;
            }
        };
        return ip;    //shuchu
    }

}