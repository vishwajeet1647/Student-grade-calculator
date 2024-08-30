import java.util.Scanner;
class GradeCalculator
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Task 2 Student Grade Calculator");
        System.out.println("Enter how many subjects=");
        int totsub=obj.nextInt();
        int total=0;
        for(int k=0;k<totsub;k++)
        {
            System.out.println("Enter marks obtained in Subject"+(k+1)+": ");
            int marks=obj.nextInt();
            total+=marks;
        }
        double averageper=(double)total/totsub;
    char Grade;
    if(averageper>=90)
    {
        Grade='O';
    }
    else if(averageper>=80)
    {
        Grade='A';
    }
    else if(averageper>=70)
    {
        Grade='B';
    }
    else if(averageper>=60)
    {
        Grade='C';
    }
    else if(averageper>=50)
    {
        Grade='D';
    }
    else if(averageper>=40)
    {
        Grade='E';
    }
    else
    {
        Grade='F';
    }
    System.out.println("Total Marks Scored :" +total);
    System.out.println("Average Percentage :" +averageper+ "%");
    System.out.println("Grade :"+Grade);
    obj.close();

    }
}