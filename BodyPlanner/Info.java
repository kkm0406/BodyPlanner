package BodyPlanner;

import java.util.*;

public class Info
{
	static Scanner sc=new Scanner(System.in);
	
    public static String InputName()
    {
        System.out.print("<<�Ż� ���� �Է�>>\n�̸��� �Է��ϼ��� : ");
        String user_name=sc.nextLine();
        return user_name;
    }
    public static float InputHeight()
    {
        System.out.print("Ű(cm) : ");
        float user_height=sc.nextFloat();
        return user_height;
    }
    public static float InputWeight()
    {
        System.out.print("������(kg) : ");
        float user_wight=sc.nextFloat();
        return user_wight;
    }
    public static int InputAge()
    {
        System.out.print("���� : ");
        int user_name=sc.nextInt();
        return user_name;
    }
    public static int InputGender()
    {
        System.out.print("������ �����ϼ��� : 1. ���� 2. ���� ");
        int user_gender=sc.nextInt();
        return user_gender;
    }
    public static double Harr(String name, double height, double weight, int age, int gender)
    {
    	double harris;
    	if(gender==1)
    		harris = 66.47 + (13.75*weight) + (5*height) - (6.76*age);
    	else
    		harris= 655.1 + (9.56*weight) + (1.85*height) - (4.68*age);
    	System.out.println(name+"���� ���ʴ�緮�� "+String.format("%.2f", harris)+"kcal �Դϴ�");
    	return harris;
    }
    public static double CalActive(double h, String name)
    {
    	System.out.println("������ ������� �Է����ּ���.\n1.�����\n"
    			+ "2.2������\n3.�ֿ� 3��\n4.�ֿ� 5~6��\n5.�� ������");
    	System.out.print("����� : ");
    	int active=sc.nextInt();
    	double amount=0;
    	if(active==1)
    		 amount = h*0.2 + h;
    	else if(active==2)
    		amount = h*0.375 + h;
    	else if(active==3)
    		amount = h*0.555 + h;
    	else if(active==4)
    		amount = h*0.725 + h;
    	else if(active==5)
    		amount = h*0.895 + h;
    	System.out.println(name+"���� Ȱ����緮�� "+String.format("%.2f", amount)+"kcal�Դϴ�");
    	return amount;
    }
    public static int BodyPlan()
    {
    	System.out.println("Body Plan�� �������ּ���");
    	System.out.println("1.��ũ��\r\n"
    			+ "2.���Ž���\r\n"
    			+ "3.���̾�Ʈ");
    	System.out.print("Body Plan : ");
    	int num=sc.nextInt();
    	if(num==1)
    		System.out.println("��ũ���� �����ϼ̽��ϴ�");
    	else if(num==2)
    		System.out.println("���Ž����� �����ϼ̽��ϴ�");
    	else if(num==3)
    		System.out.println("���̾�Ʈ�� �����ϼ̽��ϴ�");
    	return num;
    }
    public static ArrayList<Double> Calculate(int m, double w, double admin)  //m�� 1, 2, 3�� �ƴҶ� a������->�����ʿ� 
    {
    	ArrayList<Double> a=new ArrayList<>();//��ũ��
    	ArrayList<Double> b=new ArrayList<>();//���Ž���
    	ArrayList<Double> c=new ArrayList<>();//���̾�Ʈ
    	if(m==1)
    	{
    		double bulk_cal=admin+600;
    		double bulk_pro=w*2.15;
    		double bulk_fat =(bulk_cal*0.245)/9.1;
    		double bulk_carbo = (bulk_cal-(bulk_pro*4.1+bulk_fat*9.1))/4.1;
    		
    		a.add(bulk_cal);
    		a.add(bulk_carbo);
    		a.add(bulk_pro);
    		a.add(bulk_fat);
    		return a;
    	}
    	else if(m==2)
    	{
    	    double lean_cal = admin+250;
    	    double lean_pro = w*1.7;
    	    double lean_fat = (lean_cal*0.23)/9.1;
    	    double lean_carbo = (lean_cal-(lean_pro*4.1+lean_fat*9.1))/4.1;
    	    	    
    	    b.add(lean_cal);
    	    b.add(lean_carbo);
    	    b.add(lean_pro);
    	    b.add(lean_fat);
    	    return b;
    	}
    	else if(m==3)
    	{
    	    double diet_cal = admin-500;
    	    double diet_pro = w*1.6;
    	    double diet_fat = (diet_cal*0.2)/9.1;
    	    double diet_carbo = (diet_cal-(diet_pro*4.1+diet_fat*9.1))/4.1;
    	    
    	    c.add(diet_cal);
    	    c.add(diet_carbo);
    	    c.add(diet_pro);
    	    c.add(diet_fat);
    	    return c;
    	}
    	return a;
    }
    public static void MakeBody(ArrayList<Double>result)
    {
    	System.out.println("�����ؾ� �� Į�θ��� �� "+String.format("%.2f", result.get(0))+"kcal�Դϴ�");
    	System.out.println("�����ؾ� �� ź��ȭ���� �� "+String.format("%.2f", result.get(1))+"kcal�Դϴ�");
    	System.out.println("�����ؾ� �� �ܹ����� �� "+String.format("%.2f", result.get(2))+"kcal�Դϴ�");
    	System.out.println("�����ؾ� �� ������ �� "+String.format("%.2f", result.get(3))+"kcal�Դϴ�");
    }
}