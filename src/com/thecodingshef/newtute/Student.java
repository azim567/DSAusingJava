package com.thecodingshef.newtute;


class Student{

    public static void main(String[] args) {

        StudentDetail stud1=new StudentDetail("chahat",2,true);

        System.out.println(stud1.getName()+" "+stud1.getAge()+" "+" "+ stud1.getLoginStatus());

    }


}

//POJO class
class StudentDetail{

    private String name;
    private int age;
    private boolean loginStatus;

    public StudentDetail(String name, int age, boolean loginStatus) {
        this.name = name;
        this.age = age;
        this.loginStatus = loginStatus;
    }

    public String getName(){
        return name;
    }

   public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}



