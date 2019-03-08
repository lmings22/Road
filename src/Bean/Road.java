package Bean;

public class Road {
    /**
     * id : 道路id
     */
    private int id;
    /**
     * length : 道路长度
     */
    private int length;
    /**
     * speed : 最高速度
     */
    private int speed;
    /**
     * channel : 道路车道数目
     */
    private int channel;
    /**
     * fromId : 起始路口id
     */
    private int fromId;
    /**
     * toId : 终点路口id
     */
    private int toId;
    /**
     * isDuplex : 是否双向
     */
    private boolean isDuplex;

    public Road(int id, int length, int speed, int channel, int fromId, int toId, boolean isDuplex) {
        this.id = id;
        this.length = length;
        this.speed = speed;
        this.channel = channel;
        this.fromId = fromId;
        this.toId = toId;
        this.isDuplex = isDuplex;
    }

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getChannel() {
        return channel;
    }

    public int getFromId() {
        return fromId;
    }

    public int getToId() {
        return toId;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
