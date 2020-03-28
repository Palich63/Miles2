import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input price of ticket: ");
        BonusMilesService bonusMilesService = new BonusMilesService();
        int miles = bonusMilesService.calculate( (int) in.nextFloat() );

        System.out.println("Accrued miles: " + miles);
    }
}
