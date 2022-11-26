package git;

import java.util.ArrayList;

public class SchoolSystem implements ISignUp {
    public static int big = 0;
    public static int middle = 0;
    public static int small = 0;
    public String operation;
    public int tempcou = 0;
    public static boolean[] result;

    public SchoolSystem() {
        this.operation = null;
    }

    public SchoolSystem(int b, int m, int s) {
        big = b;
        middle = m;
        small = s;
        result = new boolean[4];
    }

    public static void main(String[] args) throws Exception {
        IParams params = ISignUp.parse();
        SchoolSystem sc = new SchoolSystem(params.getBig(), params.getMedium(), params.getSmall());
        ArrayList<Integer> plan = params.getPlanSignUp();

        for(int i = 0; i < plan.size(); ++i) {
            result[i] = sc.addStudent((Integer)plan.get(i));
        }

        sc.print();
    }

    public void print() {
        System.out.print("[");
        System.out.print("null,");

        for(int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + ",");
        }

        System.out.print("]");
    }

    public boolean addStudent(int stuType) {
        if (stuType == 1 && big > 0) {
            --big;
            return true;
        } else if (stuType == 2 && middle > 0) {
            --middle;
            return true;
        } else if (stuType == 3 && small > 0) {
            --small;
            return true;
        } else {
            return false;
        }
    }
}
