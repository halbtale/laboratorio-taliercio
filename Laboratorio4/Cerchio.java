public class Cerchio {
    private double x;
    private double y;
    private double radius;

    private double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) - Math.pow(y1 - y2, 2));
    }

    /*
     * Construttore della classe Cerchio: centro (x,y) e raggio
     */
    public Cerchio(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /*
     * Verifica se questo cerchio e il cerchio c sono coincidenti,
     * ovvero se hanno tutti i punti in comune
     */

    public boolean isCoincident(Cerchio c) {
        if (c.x == this.x && c.y == this.y && c.radius == this.radius)
            return true;
        else
            return false;
    }

    /*
     * verifica se questo cerchio e' interno al cerchio c o se
     * il cerchio c e' interno a questo cerchio
     */
    public boolean isEncircled(Cerchio c) {
        if (getDistance(c.x, this.x, c.y, this.y) < Math.abs(c.radius - this.radius))
            return true;
        else
            return false;
    }

    /*
     * verifica se questo cerchio e il cerchio c sono esterni, ovvero non
     * sono contenuti uno nell'altro e non hanno alcun punto in comune
     */
    public boolean isExternal(Cerchio c) {
        if (getDistance(c.x, this.x, c.y, this.y) > Math.abs(c.radius + this.radius))
            return true;
        else
            return false;
    }

    /*
     * verifica se questo cerchio e il cerchio c sono secanti,
     * ovvero se hanno almeno un punto in comune.
     */
    public boolean isSecant(Cerchio c) {
        if (getDistance(c.x, this.x, c.y, this.y) > Math.abs(c.radius - this.radius)
                && getDistance(c.x, this.x, c.y, this.y) < Math.abs(c.radius + this.radius))
            return true;
        else
            return false;
    }

    /*
     * Verifica se questo cerchio e il cerchio c sono tangenti,
     * ovvero se hanno un solo punto in comune
     */
    public boolean isTangential(Cerchio c) {
        if (getDistance(c.x, this.x, c.y, this.y) == Math.abs(c.radius + this.radius)
                || getDistance(c.x, this.x, c.y, this.y) == Math.abs(c.radius - this.radius))
            return true;
        else
            return false;
    }

}