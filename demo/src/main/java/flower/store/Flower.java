package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter @NoArgsConstructor @AllArgsConstructor @ToString
public class Flower {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower){
        this.flowerType = flowerType;
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;
    }

    public void setColor(FlowerColor color) {
        switch (flowerType) {
            case ROSE:
                this.color = (color == FlowerColor.RED) ? color : FlowerColor.RED;
                break;
            case TULIP:
                this.color = (color == FlowerColor.YELLOW) ? color : FlowerColor.YELLOW;
                break;
            case CHAMOMILE:
                this.color = (color == FlowerColor.WHITE) ? color : FlowerColor.WHITE;
                break;
            default:
                this.color = color;
                break;
        }
    }

    public void setPrice(int price) {
        switch (flowerType) {
            case TULIP:
                price = 60;
                break;
            case ROSE:
                price = 70;
                break;
            case CHAMOMILE:
                price = 40;
                break;
            default:
                price = price;
        }
    }
    

}
