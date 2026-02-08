interface IPayment {
    boolean pay();
}

class AtmPayment implements IPayment {
    public boolean pay() {
        System.out.println("ATM Payment");
        return true;
    }
}

class UpiPayment implements IPayment {
    public boolean pay() {
        System.out.println("UPI Payment");
        return true;
    }
}

class CashOnDelivery implements IPayment {
    public boolean pay() {
        System.out.println("COD Payment");
        return true;
    }
}

class PaymentFactory {
    public static IPayment createPayment(String type) {
        switch (type) {
            case "ATM": return new AtmPayment();
            case "UPI": return new UpiPayment();
            case "COD": return new CashOnDelivery();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}

class Test {
    public static void main(String[] args) {
        IPayment payment = PaymentFactory.createPayment("UPI");
        payment.pay();
    }
}