package schwimmer.projectile;

import schwimmer.projectile.Projectile;

public class Main {
    public static void main(String[] args) {

        Projectile projectile = new Projectile(39, 77);

        for (int time = 0; time < 11; time++) {
            System.out.printf("(%f, %f)\n", projectile.getX(time), projectile.getY(time));
        }

    }
}