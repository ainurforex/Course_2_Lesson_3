public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Грузовик:" + getModelName() +
                " Количество колес:" + getWheelsCount() +
                " Имеется двигатель." +
                " Имеется прицеп.";
    }

    @Override
    public void checkTransport() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}