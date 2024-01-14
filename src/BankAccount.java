public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма на снятие больше," +
                    " чем остаток на счёте. На вашем счёте осталось: " + this.amount + " сом.", this.amount);
        }
        amount -= sum;
    }
}