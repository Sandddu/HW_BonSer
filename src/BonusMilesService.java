public class BonusMilesService {

    //  Мили начисляются как 1 миля за 20 рублей в стоимости билета, дробные мили не доходят.

    public int calculate(int cost) {

        int bonus;
        if (cost >= 20) {
            bonus = cost / 20;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}
