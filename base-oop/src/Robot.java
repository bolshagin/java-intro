enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.RIGHT;
                break;
            case UP: direction = Direction.LEFT;
                break;
            case RIGHT: direction = Direction.UP;
                break;
            case LEFT: direction = Direction.DOWN;
        }
    }

    public void turnRight() {
        System.out.println("Поворот по часовой стрелке");
        switch (getDirection()){
            default:
            case DOWN: direction = Direction.LEFT;
                break;
            case UP: direction = Direction.RIGHT;
                break;
            case RIGHT: direction = Direction.DOWN;
                break;
            case LEFT: direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT)
                robot.turnRight();
            while (robot.getX() < toX)
                robot.stepForward();
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT)
                robot.turnLeft();
            while (robot.getX() > toX)
                robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP)
                robot.turnRight();
            while (robot.getY() < toY)
                robot.stepForward();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN)
                robot.turnRight();
            while (robot.getY() > toY)
                robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot walle = new Robot(0, 0, Direction.UP);

        System.out.format("начальная позиция робота (x, y) = (%d, %d) \n", walle.x, walle.y);
        walle.moveRobot(walle, 3, 0);
        System.out.format("конечная позиция робота (x, y) = (%d, %d) \n", walle.x, walle.y);

    }
}
