
import java.util.Formatter;
import java.util.Scanner;

public class funkciaformatirovania {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]){
			try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("������� ��� ���?");
			//String a = scn.next(); 
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("��� �����?");
			String b =scn.next();
			
			System.out.println("���� �������?");
			String c = scn.next();
			
			System.out.println("���� ���?");
			String d = scn.next();
			
			System.out.println("���� ��������?");
			String e = scn.next();
			
			System.out.println("��� �������?");
			String j = scn.next();
			
			x.format(" � ���� � ������ %s\n,��� %d ���\n,��� ������� %s\n,���� ����� %s\n,��� �������� %s\n,��� ���. %s\n",b , a, c, d, e, j);
			x.close();
		}catch(Exception e){};
	}
		
}

//%s-������
//%d-����� �����
//%f-����� � ��������� ������
//\n-����� ������