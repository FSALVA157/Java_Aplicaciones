
package vector;


class Vector implements VectorInterface {
    private int x;
    private int y;

    public Vector() {
    }

      
    
   
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Vector SumaVectores(Vector v2) {
       return CrearVector(this.x + v2.getX(),this.y + v2.getY());
        
    }

    @Override
    public Vector ProductoPorUnEscalar(int k) {
        return CrearVector(k * this.x,k * this.y);
    }

    @Override
    public double Modulo() {
        return Math.sqrt(Math.pow((double)this.x, 2) + Math.pow((double)this.y, 2));
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public Vector CrearVector(int x, int y) {
        return new Vector(x,y);
    }

    @Override
    public double ProductoEscalar(Vector v2) {
        return this.x*v2.getX() + this.y * v2.getY();
    }
    
}
