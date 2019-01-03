/** 
* <h1>Dimensions</h1>
* Classe représentant des dimensions LONGUEUR et HAUTEUR.
* @author Alexis TADIFO
* @version 0.1 
* @since 2018/12/21 
*/

package view;

public class Dimensions {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    public Dimensions(double height, double width) {
        this.height = height;
        this.width = width;
    }
	
    public Dimensions(){
	this.height = 0;
	this.width = 0;
    }

}
