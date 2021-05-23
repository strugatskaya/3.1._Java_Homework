public class BonusMilesService {
public int calculate(int ticketPrice) {
    int oneMileCost = 20;
    int totalMilesBonuses;
   totalMilesBonuses = (int) ticketPrice / oneMileCost;
    return totalMilesBonuses;
}
}