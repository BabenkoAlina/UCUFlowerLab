package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public void setQuantity(int quantity){
        this.quantity = quantity < 1 ? 0 : quantity;
    }
    public FlowerPack(Flower flower, int quantity){
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice(){
        return flower.getPrice() * quantity;
    }
}
