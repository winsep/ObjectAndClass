package advance.dev;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		p.name = "Thang";
        p.age = 19;
        p.dtb = 9;
        p.Address = "Hue";
        System.out.println(p.name+"\n"+p.age+"\n"+p.dtb+"\n"+p.Address);
	}

}
