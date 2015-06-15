package ba.bitcamp.week5.day1;

public class Bag {

private Integer capacity;
private Integer currentCapacity;

public Bag(Integer capacity) {
    super();
    this.capacity = capacity;
    this.currentCapacity = 0;
}

@Override
public String toString() {
    return "Bag [capacity=" + capacity + ", curentCapacity="
            + currentCapacity + "]";
}

public Integer getMaxCapacity() {

    return capacity;

}

public Integer getCurrentCapacity() {

    return currentCapacity;
}

public Integer getFreeSpace() {

    return capacity - currentCapacity;
}

public void add(Integer add) {
    if (currentCapacity + add <= capacity) {
        currentCapacity += add;
    } 
}

public void subtract(Integer sub) {

    if(currentCapacity-sub >=0){
    currentCapacity -= sub;
    }
}
}