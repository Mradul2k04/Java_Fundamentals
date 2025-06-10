import java.util.Scanner;
public class volume_of_cylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius=sc.nextDouble();
		double height=sc.nextDouble();
		double vol= Math.PI*radius*radius*height;
		System.out.println(vol);

	}

}
