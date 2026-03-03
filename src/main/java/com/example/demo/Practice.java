package com.example.demo;

public class Practice {
    private String name;
    private int age;
    private int marks;
    private String result;


    public Practice(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;

        if(marks>=50){
            this.result="Pass";
        }
        else{
            this.result="Fail";
        }
        }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getMarks(){
        return marks;
    }

    public String getResult(){
        return result;
    }
}
