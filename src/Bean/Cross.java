package Bean;

public class Cross {
    /**
     * id : 路口id
     */
    private int id;
    /**
     * topId : 路口上方道路id
     */
    private int topId;
    /**
     * leftId : 路口右侧道路id
     */
    private int rightId;
    /**
     * bottomId : 路口底部道路id
     */
    private int bottomId;
    /**
     * leftId : 路口左侧道路id
     */
    private int leftId;

    public Cross(int id, int topId, int rightId, int bottomId, int leftId) {
        this.id = id;
        this.topId = topId;
        this.rightId = rightId;
        this.bottomId = bottomId;
        this.leftId = leftId;
    }

    public int getId() {
        return id;
    }

    public int getTopId() {
        return topId;
    }

    public int getRightId() {
        return rightId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public int getLeftId() {
        return leftId;
    }
}
