package main;
import java.util.Scanner;
public class maintest {

	public static void main (String []arge){
		double sum=0,ave;
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ǹ�ѧ���ĳɼ���");
		int score[]=new int[10];
		int youxiu=0,lianghao=0,bujige=0;
		for(int i=0;i<10;i++){
			score[i]=sc.nextInt();
			sum+=score[i];
			if(score[i]>=80&&score[i]<=100){
				youxiu++;
			}
			if(score[i]>=60&&score[i]<=80){
				lianghao++;
			}
			if(score[i]>=0&&score[i]<=60){
				bujige++;
			}
			if(score[i]>100||score[i]<0){
				System.out.println("��������");
			}
		}
	
		System.out.println("����="+youxiu+"����="+lianghao+"������="+bujige);
	}

}
