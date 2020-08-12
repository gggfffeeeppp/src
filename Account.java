/**
 * FileName: Account
 * Author:   蔡志勇
 * Date:     2020/7/8 22:33
 * Description: 银行
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈银行〉
 *
 * @author 蔡志勇
 * @version 1.0.0
 * @date 2020/7/8
 */
public class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        System.out.printf("正在将金额为%f的人民币存入", amt);
        this.balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        System.out.printf("正在将金额为%f的人民币取出", amt);
        if (this.balance < amt) {
            throw new OverdraftException("余额不足", amt - this.balance);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) throws OverdraftException {
        Account ac = new Account(1000);
        CheckingAccount ca = new CheckingAccount(1000,1000);
        ac.deposit(1000);
        ca.deposit(1000);
        System.out.println(ca.getBalance());
        try {
            ca.withdrow(600);
            System.out.println(ca.getBalance());
            ca.withdrow(600);
            System.out.println(ca.getBalance());
            ca.withdrow(600);
            System.out.println(ca.getBalance());
            ca.withdrow(600);
            System.out.println(ca.getBalance());
            ca.withdrow(600);
            System.out.println(ca.getBalance());
            ca.withdrow(600);
            System.out.println(ca.getBalance());
        } catch (OverdraftException e) {
            System.out.printf("超出预支额度%f", e.getDeficit());
            e.printStackTrace();
        }
        System.out.println("\n账户余额为" + ac.getBalance());
        try {
            ac.withdraw(2001);
        } catch (OverdraftException e) {
            System.out.printf("\n余额不足透支金额为%f\n", e.getDeficit());
            e.printStackTrace();
        }
    }
}

class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;

    }

    public double getDeficit() {
        return deficit;
    }
}

class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdrow(double amt) throws OverdraftException {
        if (amt > this.balance + overdraftProtection) {
            double deficit = amt - this.balance - overdraftProtection;
            throw new OverdraftException("透支额度超标", deficit);
        }
        balance -= amt;
    }
}
