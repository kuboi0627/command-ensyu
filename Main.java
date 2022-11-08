
import java.util.Scanner;
  public class Main {  
  public static void main(String[] args) {
  for(int i =0; i < 2; i++){	  
  Scanner scanner = new Scanner(System.in);
  System.out.print("身長(cm)=");
  double height = scanner.nextDouble() / 100;
  System.out.print("体重(kg)=");
  double weight = scanner.nextDouble();
  System.out.println("BMI=" + weight / height / height);

  double v1 = weight / height / height;
  String sv = String.format("%.2f", v1);
  double v2 = Double.parseDouble(sv);
  System.out.println("BMIを小数点第二位に表すと="+v2);
  }
  }
}
