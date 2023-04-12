public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 40;
        cardDeliveryTime(deliveryDistance);
    }

    public static void cardDeliveryTime(int distance) {
        if ((distance > 0) && (distance <= 60)) {
            int deliveryTime = 0;
            for (int i = 0; i < distance; i += 20) {
                deliveryTime++;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
}