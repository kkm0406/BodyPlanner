package BodyPlanner;

import java.util.*;

public class Wundong 
{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> back= new ArrayList<>(Arrays.asList("Ǯ ��", "�� Ǯ �ٿ�", "�ٺ� �ο�", "��Ƽ�� �ο�"));
	static ArrayList<String> chest= new ArrayList<>(Arrays.asList("��ġ������", "����", "��Ŭ���� ��ġ������", "ü��Ʈ �ö���"));
	static ArrayList<String> shoulder= new ArrayList<>(Arrays.asList("���̵� ���ͷ� ������", "�и��͸� ������", "��Ʈ���� ������", "���� ������"));
	static ArrayList<String> biceps= new ArrayList<>(Arrays.asList("���� ��", "�ٺ� ��", "�ظ� ��"));
	static ArrayList<String> triceps= new ArrayList<>(Arrays.asList("���̺� Ǫ���ٿ�", "���� Ʈ���̼� �ͽ��ټ�", "���� ű��"));
	static ArrayList<String> leg= new ArrayList<>(Arrays.asList("����Ʈ", "����������", "����", "���� �ͽ��ټ�"));
	static ArrayList<String> abs= new ArrayList<>(Arrays.asList("ũ��ġ", "���׷�����"));
	public static ArrayList<Double> oxy_cal=new ArrayList<Double>();//����� Į�θ��� �����ϴ� �迭
	public static void PrintMuscle(int n)
	{
		if(n==1)
		{
			for(int i=0;i<back.size();i++)
				System.out.println(i+1+". "+back.get(i));
		}
		else  if(n==2)
		{
			for(int i=0;i<chest.size();i++)
				System.out.println(i+1+". "+chest.get(i));
		}
		else  if(n==3)
		{
			for(int i=0;i<shoulder.size();i++)
				System.out.println(i+1+". "+shoulder.get(i));
		}
		else  if(n==4)
		{
			for(int i=0;i<biceps.size();i++)
				System.out.println(i+1+". "+biceps.get(i));
		}
		else  if(n==5)
		{
			for(int i=0;i<triceps.size();i++)
				System.out.println(i+1+". "+triceps.get(i));
		}
		else  if(n==6)
		{
			for(int i=0;i<leg.size();i++)
				System.out.println(i+1+". "+leg.get(i));
		}
		else  if(n==7)
		{
			for(int i=0;i<abs.size();i++)
				System.out.println(i+1+". "+abs.get(i));
		}
	}
	public static ArrayList<Integer> CountWeight()
	{
		ArrayList<Integer> reps=new ArrayList<>();
		System.out.println("��� �ݺ�Ƚ�� �� ��Ʈ���� �����ϼ���");
		System.out.print("���� : ");
		int w=sc.nextInt();
		reps.add(w);
		System.out.print("�ݺ� Ƚ�� : ");
		int ea=sc.nextInt();
		reps.add(ea);
		System.out.print("��Ʈ ��: ");
		int sets=sc.nextInt();
		reps.add(sets);
		return reps;
	}
	public static ArrayList<String> Muscle(int n)
	{
		ArrayList<String> choose_num=new ArrayList<String>();
		System.out.println("���� ��� �� �� ��� �����ϼ���"
				+"\n�����Ϸ��� 0�� �����ϼ���");
		if(n==1)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(back.get(at-1));
				System.out.println(back.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==2)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(chest.get(at-1));
				System.out.println(chest.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==3)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(shoulder.get(at-1));
				System.out.println(shoulder.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==4)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(biceps.get(at-1));
				System.out.println(biceps.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==5)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(triceps.get(at-1));
				System.out.println(triceps.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==6)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(leg.get(at-1));
				System.out.println(leg.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		else if(n==7)
		{
			choose_num.clear();
			while(true)
			{
				System.out.print("���� : ");
				int at=sc.nextInt();
				if(at==0)
					break;
				choose_num.add(abs.get(at-1));
				System.out.println(abs.get(at-1)
						+" ��� �߰��Ǿ����ϴ�");
			}
			return choose_num;
		}
		return choose_num;
	}
	public static double CalculateRunning(int v, double w,int t)
	{
		double result=0;
		if(v>=8.1)
			result=0.0175*((0.2*(v*16.667) + 3.5)/3.5)*(w*100)*t;
		else
			result = 0.0175*((0.1*(v*16.667) + 3.5)/3.5)*(w*100)*t;
		return result;
	}
	public static double CalculateCycle(int d, double m, int t)
	{
		double ret=0;
		double v=d / (t / 60) ;
		if(v<13)
			ret=0.05*m*t;
		else if(13<=ret&&ret<16)
			ret=0.065*m*t;
		else if(16<=ret&&ret<19)
			ret=0.0783*m*t;
		else if(19<=ret&&ret<22)
			ret=0.0939*m*t;
		else if(22<=ret&&ret<24)
			ret=0.113*m*t;
		else if(24<=ret&&ret<26)
			ret=0.124*m*t;
		else if(26<=ret&&ret<27)
			ret=0.136*m*t;
		else if(27<=ret&&ret<29)
			ret=0.149*m*t;
		else if(29<=ret&&ret<31)
			ret=0.163*m*t;
		else if(31<=ret&&ret<32)
			ret=0.176*m*t;
		else if(32<=ret&&ret<34)
			ret=0.196*m*t;
		else if(34<=ret&&ret<37)
			ret=0.215*m*t;
		else if(37<=ret&&ret<40)
			ret=0.259*m*t;
		else if(40<=ret)
			ret=0.311*m*t;
      return ret;
	}
	public static ArrayList<String> OxygenTraining(int a, double w)
	{
		ArrayList<String>choose_num1=new ArrayList<String>();
		double ret1=0, ret2=0, ret3=0;
		if(a==1)
		{
			choose_num1.clear();
			choose_num1.add("���׸ӽ�");
			System.out.println("���׸ӽ� kcal�� ����մϴ�");
			System.out.print("�ӵ��� �Է��ϼ���(km/h) : ");
			int velo=sc.nextInt();
			System.out.print("�ð��� �Է��ϼ���(min)  : ");
			 int time=sc.nextInt();
			 ret1=(CalculateRunning(velo, w, time)/100);
			 System.out.println("�Ҹ��� Į�θ��� �� "+String.format("%.2f", ret1)+"kcal�Դϴ�");
			 oxy_cal.add(ret1);
		}
		else if(a==2)
		{
			choose_num1.clear();
			choose_num1.add("����Ŭ");
			System.out.println("����Ŭ kcal�� ����մϴ�");
			System.out.print("�Ÿ��� �Է��ϼ���(km/h) : ");
			int dist=sc.nextInt();
			System.out.print("�ð��� �Է��ϼ���(min)  : ");
			 int time=sc.nextInt();
			 ret2=CalculateCycle(dist, w, time);
			 System.out.println("�Ҹ��� Į�θ��� �� "+String.format("%.2f", ret2)+"kcal�Դϴ�");
			 oxy_cal.add(ret2);
		}
		else if(a==3)
		{
			choose_num1.clear();
			choose_num1.add("������");
			System.out.println("������ kcal�� ����մϴ�");
			System.out.print("�ð��� �Է��ϼ���(min)  : ");
			 int time=sc.nextInt();
			 ret3=2*0.07*time;
			 System.out.println("�Ҹ��� Į�θ��� �� "+String.format("%.2f", ret3)+"kcal�Դϴ�");
			 oxy_cal.add(ret3);
		}
		return choose_num1;
	}
	public static ArrayList<String> Training(double w)
	{
		ArrayList<String> choose=new ArrayList<String>();
		while(true)
		{
			System.out.println("�� ��� �������ּ���\n1. ����Ʈ\n"
					+ "2. �����\n3. ����");
			System.out.print("� : ");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("<<����Ʈ Ʈ���̴� MODE>>");
				while(true)
				{
					System.out.println("��� ������ �������ּ���");
					System.out.println("1. ��\n2. ����\n3. ���\n"
							+"4. �̵�\n5. ���\n6. ��ü\n"
							+"7. ����\n-1. ����");
					System.out.print("� ���� : ");
					int part=sc.nextInt();
					if(part==-1)
						break;
					PrintMuscle(part);
					choose.addAll(Muscle(part));
				}
			}
			else if(n==2)
			{
				System.out.println("<<����� MODE>>");
				while(true)
				{
					System.out.println("������ ����� ��� �����ϼ���");
					System.out.println("1. ���׸ӽ�\n2. ����Ŭ\n3. ������\n"
							+"-1. ����");
					System.out.print("����� : ");
					int oxy=sc.nextInt();
					if(oxy==-1)
						break;
					else
						choose.addAll(OxygenTraining(oxy, w));
				}
			}
			else if(n==3)
			{
				System.out.println("� MODE�� �����մϴ�");
				 return choose;
			}
		}
	}
	public static void TodayTraining(ArrayList<String> n)
	{
		System.out.println("<<���� ������ � ���>>");
		for(int i=0;i<n.size();i++)
			System.out.println(i+1+". "+n.get(i));
		double oxy_ret=0;
		for(int i=0;i<oxy_cal.size();i++)
			oxy_ret+=oxy_cal.get(i);
		System.out.println("����ҷ� �Ҹ��� �� ������ "+String.format("%.2f", oxy_ret)+"kcal�Դϴ�");
	}
}
