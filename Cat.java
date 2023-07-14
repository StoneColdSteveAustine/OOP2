package OOP2;

public class Cat extends Team {
    
    public Cat(String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }


    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRange() <= getMaxRange() )
            System.out.println("Barsik " + getName() + " пробежал " + treadmill.getRange() + " метров" );
        else System.out.println("Barsik " + getName() + " не смог пробежать " + treadmill.getRange() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Barsik " + getName() + " смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Barsik " + getName() + " не смог перепрыгнуть препятствие высотой " + wall.getHeight());
    }
}
