package schwimmer.projectile;

public class Projectile {

    private final double angle;
    private final double velocity;
    private final double radians;

    public Projectile(double angle, double velocity) {
        this.angle = angle;
        this.velocity = velocity;
        this.radians = Math.toRadians(angle);
    }

    public double getAngle() {
        return angle;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getX(double time) {
        return Math.cos(radians) * velocity * time;
    }

    public double getY(double time) {
        return Math.sin(radians) * velocity * time - .5 * 9.8 * time * time;
    }

}
