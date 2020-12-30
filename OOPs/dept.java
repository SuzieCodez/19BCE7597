import java.util.*;
import java.util.Scanner;

public class dept{
    static Scanner in=new Scanner(System.in);
    static String staffName,desig,exp,q,deptName,HODname;
    static int staffID,totStud,totSec,i=0,jC,pjC,ptC;
    static StaffMember s[]=new StaffMember[15];
    public static void main(String[] args) {
        getDataDept();
        Department d=new Department(deptName,HODname,totStud,totSec);
       do{
           getDataStaff();
           s[i]=new StaffMember(staffName,desig,q,exp,staffID);
           /*System.out.println("Do you want to continue entering the detail of the next staff");
           ch=in.next().charAt(0);*/
           /*if(ch=='y')*/
               i++;
       }while (i<15);
       d.showDepartmentDetails();
        for(int j=0;j<i;j++)   {
            s[j].showStaffDetails();
            s[j].showPublicationDetail();
        }
    }
    /*
    public static void display(){

    }*/

    public static void getDataStaff(){
        System.out.println("Entry "+(i+1));
        System.out.println("\nEnter your Name: ");
        staffName=in.next();
        System.out.println("Enter your Staff ID:");
        staffID=in.nextInt();
        System.out.println("Enter your qualification: ");
        q=in.next();
        System.out.println("Enter your Experience: ");
        exp=in.next();
        System.out.println("Enter your designation: ");
        desig=in.next();
       /* System.out.println("Enter your Journal Count: ");
        jC=in.nextInt();
        System.out.println("Enter your Project Count: ");
        pjC=in.nextInt();
        System.out.println("Enter your Pattern Count: ");
        ptC=in.nextInt();*/
    }
    public static void getDataDept(){

        System.out.println("Enter your Dept Name: ");
        deptName=in.next();
        System.out.println("Enter Department's HOD's name: ");
        HODname=in.next();
        System.out.println("Enter total Student: ");
        totStud=in.nextInt();
        System.out.println("Enter total sections: ");
        totSec=in.nextInt();
    }
}

interface Publication{
int journalCount=10,projectCount=12,patternCount=19;
public void showPublicationDetail();
}

class Department{
String DeptName,HODName;
int totalStud,noSec;

Department(String deptName, String HODName, int totalStud, int noSec){
    this.noSec=noSec;
    this.totalStud=totalStud;
    this.HODName=HODName;
    this.DeptName=deptName;
}

public void showDepartmentDetails(){
    System.out.println("Details of the Department\n");
    System.out.println("Name: "+DeptName);
    System.out.println("HOD: "+HODName);
    System.out.println("Total Students: "+totalStud);
    System.out.println("Sections: "+noSec);
}
}

class StaffMember extends Department implements Publication{
String staffMemName,designation,qualification,experience;
int staffID;

StaffMember(String staffMemName,String designation,String qualification,String experience,int staffID){
    super("","",0,0);
    this.staffID=staffID;
    this.staffMemName=staffMemName;
    this.designation=designation;
    this.qualification=qualification;
    this.experience=experience;
}

public void showStaffDetails(){
    System.out.println("Staff Details\n");
    System.out.println("Name: "+staffMemName);
    System.out.println("ID: "+staffID);
    System.out.println("Qualification: "+qualification);
    System.out.println("Designation: "+designation);
    System.out.println("Experience: "+experience);
}

public void showPublicationDetail(){
    System.out.println("Journal Count: "+journalCount);
    System.out.println("Project Count: "+projectCount);
    System.out.println("Pattern Count: "+patternCount);
}

}