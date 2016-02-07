
import java.util.Formatter;
import java.util.Scanner;

public class funkciaformatirovania {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]){
			try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("Сколько вам лет?");
			//String a = scn.next(); 
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Ваш город?");
			String b =scn.next();
			
			System.out.println("Ваша фамилия?");
			String c = scn.next();
			
			System.out.println("Ваше имя?");
			String d = scn.next();
			
			System.out.println("Ваше отчество?");
			String e = scn.next();
			
			System.out.println("Ваш телефон?");
			String j = scn.next();
			
			x.format(" Я живу в городе %s\n,Мне %d лет\n,Моя фамилия %s\n,Меня зовут %s\n,Мое отчество %s\n,Мой тел. %s\n",b , a, c, d, e, j);
			x.close();
		}catch(Exception e){};
	}
		
}

//%s-строка
//%d-целое число
//%f-число с плавающей точкой
//\n-новая строка