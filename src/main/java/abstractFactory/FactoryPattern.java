package abstractFactory;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/18.
 */
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Sharpe square =  shapeFactory.getSharpe("SQUARE");
        square.draw();
        Sharpe circle = shapeFactory.getSharpe("CIRCLE");
        circle.draw();
    }
}
