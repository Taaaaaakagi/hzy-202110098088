package git;

import java.util.ArrayList;
import java.util.Scanner;
public interface ISignUp {
    public void print();
    public boolean addStudent (Integer stuType);
    public static IParams parse() throws Exception{
        final Scanner reader = new Scanner(System.in);
        System.out.print("������");
        SchoolSystem._big = reader.nextInt();
        System.out.print("�а����");
        SchoolSystem._medium = reader.nextInt();
        System.out.print("С�����");
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
                System.out.print("����༶��");
                Integer a = reader.nextInt();
                input.add(a);
                System.out.print("����༶��");
                Integer b = reader.nextInt();
                input.add(b);
                System.out.print("����༶��");
                Integer c = reader.nextInt();
                input.add(c);
                System.out.print("����༶��");
                Integer d = reader.nextInt();
                input.add(d);
                return input;
            }
        };
        return ip;
    }

}