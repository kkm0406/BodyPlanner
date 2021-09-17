package BodyPlanner;

import java.util.*;


public class Sikdan
{
	static Scanner sc=new Scanner(System.in);
    static double[] hyunmi = {195, 43, 4,  1.4};
	static double[] bread = {247, 41, 13, 4};
    static double[] s_potato = {155,37, 1.4, 0};
    static double[] chicken =  {164, 0, 30, 4};
    static double[] nuts =  {85, 11, 3, 4};
	 static double[] avocado = {187, 6, 2, 19};
	 static double[] salmon = {110, 0, 20, 4};
	 static double[] my_protein =  {100, 1.5, 21, 2};
	 static double[] apple =  {52, 15, 0, 0};
	 static double[] egg = {68, 0.5, 6, 5};
	 static double[] milk =  {130, 9, 69, 8};
	 static double[] almond =  {174,6.5, 6, 15};
	 public static ArrayList<String> food_list = new ArrayList<String>();//���� ������ �����ϴ� �迭
	public static ArrayList<Double> AddSum(ArrayList<Double>a, double[] b)
	{
		a.add(0, b[0]);
		a.add(1, b[1]);
		a.add(2, b[2]);
		a.add(3, b[3]);
		return a;
	}
	public static ArrayList<Double> Meal()
	{
		ArrayList<Double> eaten= new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0, 0.0));
		System.out.println("<�Ĵ��� �������ּ���>\n���籺�� �����ϼ���");
		while(true)
		{
			System.out.println("1.ź��ȭ��\n2.�ܹ���\n3.����\n4.�߰�\n0.����");
			System.out.print("���籺 : ");
			int nutri=sc.nextInt();
			if(nutri==1)
			{
				System.out.println("ź��ȭ�� �Է��� ���� ���ĵ��Դϴ�");
				System.out.println("-------------------------");
				System.out.println("1. ���̹�\n2. ��л�\n3. ����");
				System.out.print("���� : ");
				int c1=sc.nextInt();
				if(c1==1)
				{
					AddSum(eaten, hyunmi);
					food_list.add("���̹�");
				}
				else if(c1==2)
				{
					AddSum(eaten, bread);
					food_list.add("��л�");
				}
				else if(c1==3)
				{
					AddSum(eaten, s_potato);
					food_list.add("����");
				}
			}
			else if(nutri==2)
			{
				System.out.println("�ܹ��� �Է��� ���� ���ĵ��Դϴ�");
				System.out.println("-------------------------");
				System.out.println("1. �߰�����\n2. ���\n3. ���� ����");
				System.out.print("���� : ");
				int d1=sc.nextInt();
				if(d1==1)
				{
					AddSum(eaten, chicken);
					food_list.add("�߰�����");
				}
				else if(d1==2)
				{
					AddSum(eaten, egg);
					food_list.add("���");
				}
				else if(d1==3)
				{
					AddSum(eaten, salmon);
					food_list.add("���� ����");
				}
				
			}
			else if(nutri==3)
			{
				System.out.println("���� �Է��� ���� ���ĵ��Դϴ�");
				System.out.println("-------------------------");
				System.out.println("1. �ƺ�ī��\r\n"
						+ "2. �Ƹ��\r\n"
						+ "3. ����");
				System.out.print("���� : ");
				int f1=sc.nextInt();
				if(f1==1)
				{
					AddSum(eaten, avocado);
					food_list.add("�ƺ�ī��");
				}
				else if(f1==2)
				{
					AddSum(eaten, almond);
					food_list.add("�Ƹ�� 30g");
				}
				else if(f1==3)
				{
					AddSum(eaten, milk);
					food_list.add("����");
				}
				
			}
			else if(nutri==4)
			{
				System.out.println("�߰������� �����ϴ� ��ǰ�Դϴ�");
				System.out.println("-------------------------");
				System.out.println("1. ����ƾ\r\n"
						+ "2. �Ϸ� ���� �߰�\r\n"
						+ "3. ���");
				System.out.print("���� : ");
				int g1=sc.nextInt();
				if(g1==1)
				{
					AddSum(eaten, my_protein);
					food_list.add("����ƾ");
				}
				else if(g1==2)
				{
					AddSum(eaten, nuts);
					food_list.add("�� �� �߰�");
				}
				else if(g1==3)
				{
					AddSum(eaten, apple);
					food_list.add("���");
				}
			}
			else if(nutri==0)
			{
				System.out.println("�Է��� ��Ĩ�ϴ�");
				break;
			}
		}
		return eaten;
		
	}
	public static void PrintFoodList()
	{
		System.out.println("--������ ���� ����Դϴ�--");
		System.out.print("[ ");
		for(int i=0;i<food_list.size();i++)
			System.out.print(food_list.get(i)+" ");
		System.out.println("]");
	}
	public static void EatAll(ArrayList<Double>eaten)
	{
		System.out.println("�� ����� ������ "+String.format("%.2f", eaten.get(0))+"kcal�Դϴ�");
		System.out.println("�� ����� ź��ȭ���� "+String.format("%.2f", eaten.get(1))+"kcal�Դϴ�");
		System.out.println("�� ����� �ܹ����� "+String.format("%.2f", eaten.get(2))+"kcal�Դϴ�");
		System.out.println("�� ����� ������ "+String.format("%.2f", eaten.get(3))+"kcal�Դϴ�");
	}
	public static ArrayList<Double> LackCal (ArrayList<Double>a, ArrayList<Double>b)
	{
		ArrayList<Double>c= new ArrayList<Double>();
		c.add(a.get(0)-b.get(0));
		c.add(a.get(1)-b.get(1));
		c.add(a.get(2)-b.get(2));
		c.add(a.get(3)-b.get(3));
		return c;
	}
	public static void PlusMinus1(double a)
	{
		if(a>=0)
			System.out.println("���ڶ� ������ "+String.format("%.2f", a)+"kcal�Դϴ�");
		else
			System.out.println("�ʰ��� ������ "+String.format("%.2f", -a)+"kcal�Դϴ�");
	}
	public static void PlusMinus2(double a)
	{
		if(a>=0)
			System.out.println("���ڶ� ź��ȭ���� "+String.format("%.2f", a)+"g�Դϴ�");
		else
			System.out.println("�ʰ��� ź��ȭ���� "+String.format("%.2f", -a)+"g�Դϴ�");
	}
	public static void PlusMinus3(double a)
	{
		if(a>=0)
			System.out.println("���ڶ� �ܹ����� "+String.format("%.2f", a)+"g�Դϴ�");
		else
			System.out.println("�ʰ��� �ܹ����� "+String.format("%.2f", -a)+"g�Դϴ�");
	}
	public static void PlusMinus4(double a)
	{
		if(a>=0)
			System.out.println("���ڶ� ������ "+String.format("%.2f", a)+"g�Դϴ�");
		else
			System.out.println("�ʰ��� ������ "+String.format("%.2f", -a)+"g�Դϴ�");
	}
}
