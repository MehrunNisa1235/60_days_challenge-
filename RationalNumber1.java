

import java.util.Scanner;

class Rational1{
	int num1;
	int num2;
	int de_num1;
	int de_num2;
	Rational1(int num1,int num2,int de_num1,int de_num2){
		this.num1=num1;
		this.num2=num2;
		this.de_num1=de_num1;
		this.de_num2=de_num2;
		if(de_num1==0&&de_num2==0) {
			System.out.println("Do not insert zero in Denumrator");
			return;
		}
	}
void find() {
		int g=gcd(num1,de_num1);
		if(g==1) {
			System.out.println("No any commom divisior");
		}else {
			num1/=g;
			de_num1/=g;
		}
		g=gcd(num2,de_num2);
		if(g==1) {
			System.out.println("No any commom divisior");
		}else {
			num2/=g;
			de_num2/=g;
		}
	}
int gcd(int num1,int num2) {
	int rem;
	while(num1%num2!=0) {
		rem=num1%num2;
		num1=num2;
		num2=rem;
	}
	return num2;
}
public String toString1() {
	return num1+" / "+de_num1;
}
public String toString2() {
	return num2+" / "+de_num2;
}
public void add() {
	int temp_num1=de_num1*de_num2;
	int temp_num2=(temp_num1/de_num1)*num1;
	int temp_num3=(temp_num1/de_num2)*num2;
	int temp_num4=temp_num2+temp_num3;
	System.out.println("sum of "+num1+" / "+de_num1+" and "+num2+" / "+de_num2+" = "+temp_num4+" / "+temp_num1);
}
public void sub() {
	int temp_num1=de_num1*de_num2;
	int temp_num2=(temp_num1/de_num1)*num1;
	int temp_num3=(temp_num1/de_num2)*num2;
	int temp_num4=temp_num2-temp_num3;
	System.out.println("subtraction of "+num1+" / "+de_num1+" and "+num2+" / "+de_num2+" = "+temp_num4+" / "+temp_num1);
}
public void mul() {
	int temp_num1=num1*num2;
	int temp_num2=de_num1*de_num2;
	int g=gcd(temp_num1,temp_num2);
	if(g==1) {
		System.out.println("No any commom divisior");
	}else {
		temp_num1/=g;
		temp_num2/=g;
	}
	System.out.println("Multiplication of "+num1+" / "+de_num1+" and "+num2+" / "+de_num2+" = "+temp_num1+" / "+temp_num2);
}
public void div() {
	int temp_num1=num1*de_num2;
	int temp_num2=num2*de_num1;
	int g=gcd(temp_num1,temp_num2);
	if(g==1) {
		System.out.println("No any commom divisior");
	}else {
		temp_num1/=g;
		temp_num2/=g;
	}
	System.out.println("Division of "+num1+" / "+de_num1+" and "+num2+" / "+de_num2+" = "+temp_num1+" / "+temp_num2);
}
	
}

public class RationalNumber1{
	static void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numerator ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter two Denumerator  ");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		sc.close();
		Rational1 obj=new Rational1(num1,num2,num3,num4);
		obj.find();
		System.out.println("Rational Number is = "+obj.toString1());
		System.out.println("Rational Number is = "+obj.toString2());
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();		

	}

}