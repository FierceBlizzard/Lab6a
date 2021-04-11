public class TrainCar {
    private String cargoType;
    private int weight;
    private TrainCar next;

    /**
     * This constructor sets up the carggo type for the train,
     * weight of the cargo in pounds and sets up the node next
     * to have a linked list
     * @param cargoType, the type of cargo it is
     * @param weight, how much the cargo weighs in pounds
     * @param next, the next node
     */
    public TrainCar(String cargoType, int weight, TrainCar next){
        this.cargoType = cargoType;
        this.weight = weight;
        this.next = next;
    }

    /**
     * This method gets the type of cargo it is
     * @return the cargo type
     */
    public String getCargoType(){
        return this.cargoType;
    }

    /**
     * This method gets the weight of the
     * cargo in pounds
     * @return the weight of the cargo in pounds
     */
    public int getWeight(){
        return this.weight;
    }

    /**
     * This method gets the next node in the linked list
     * @return this returns the next node in the linked list
     */
    public TrainCar getNext(){
        return this.next;
    }

    /**
     * th
     * @param cargoType
     */
    public void setCargoType(String cargoType){
        this.cargoType = cargoType;
    }
}
