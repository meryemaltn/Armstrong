import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Sayý Giriniz : ");
        int number = input.nextInt();
        int numberCounter = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber/=10;
            numberCounter++;
        }
        
        System.out.println("Basamak Sayýsý "+ numberCounter);
        int total = 0;
        while (number > 0) {
            total = total + (number % 10);
            number /= 10;
        }

        System.out.println("toplam= " +total);
	}

}
