package Bean;

public class Car {
    /**
     * id : 车辆id
     */
    private int id;
    /**
     * startId : 起始点id
     */
    private int fromId;
    /**
     * toId : 目的点id
     */
    private int toId;
    /**
     * speed : 最高速度
     */
    private int speed;
    /**
     * time : 出发时间
     */
    private int time;

    public Car(int id, int fromId, int toId, int speed, int time) {
        this.id = id;
        this.fromId = fromId;
        this.toId = toId;
        this.speed = speed;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getFromId() {
        return fromId;
    }

    public int getToId() {
        return toId;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTime() {
        return time;
    }
}
