public abstract class Transport {
    private String modelName;
    private int wheelsCount;


    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Имя модели:" + modelName +
                " Количество колес:" + wheelsCount;
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void checkTransport() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
