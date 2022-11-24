package git;

import java.util.Scanner;

public class SchoolSystem implements ISignUp {
    public static Integer _big;
    public static Integer _medium;
    public static Integer _small;

    public SchoolSystem(Integer big,Integer medium ,Integer small){
        _big=big;
        _medium=medium;
        _small=small;
    }
    public boolean addStudent(Integer stuType){
        if (stuType==1){
            if(_big!=0&&_big!=null){
                _big--;
                return true;
            }
        }
        if(stuType==2){
            if(_medium!=0&&_medium!=null){
                _medium--;
                return true;
            }
        }
        if(stuType==3){
            if(_small!=0&&_small!=null){
                _small--;
                return true;
            }
        }
        return false;
    }
    public String []parse(String ... input){
        if(input.equals("SchoolSystem")){
            String []a1={_big.toString(),_medium.toString(),_small.toString()};
            return a1;
        }
        if(input.equals("addStudent")){
            String []a2={"1"};
            return a2;
        }
        if(input.equals("addStudent")){
            String []a3={"2"};
            return a3;
        }
        if(input.equals("addStudent")){
            String []a4={"3"};
            return a4;
        }
        if(input.equals("addStudent")){
            String []a5={"1"};
            return a5;
        }
        return new String[]{};
    }
    public void print(){
         System.out.println(this.addStudent(1));
    }
}
