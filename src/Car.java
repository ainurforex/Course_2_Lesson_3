public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Автомобиль:" + getModelName() +
                " Количество колес:" + getWheelsCount() +
                " Имеется двигатель.";
    }

    @Override
    public void checkTransport() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
    }
}