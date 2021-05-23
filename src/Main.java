public class Main {
    public static void main(String[] args) {
      BonusMilesService service = new BonusMilesService();
      int totalMilesBonuses = service.calculate(35_870);
        System.out.println(totalMilesBonuses);
    }
}