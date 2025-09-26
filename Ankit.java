class Student
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("enter the input for ypur roll name marks ");
    }

}
class Ankit extends Student
{
    void disp()
    {
        roll=1;  name="Ankit"; marks=99;
        System.out.println(roll+"  "+name+" " + marks);  
    }
    public static void main(String[] args) {
        Ankit A=new Ankit();
        A.input();
        A.disp();
    }
}

