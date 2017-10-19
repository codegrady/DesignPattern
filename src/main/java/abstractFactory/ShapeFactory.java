package abstractFactory;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/18.
 */
public class ShapeFactory {
    public Sharpe getSharpe(String sharpeType){
        if(sharpeType==null) {
            return null;
        }
//        else if(sharpeType.equals("SQUARE")){
//            return new Square();
//        }else if(sharpeType.equals("CIRCLE")){
//            return new Circle();
//        }else if(sharpeType.equals("RECTANGLE")){
//            return new Rectangle();
//        }

        switch (sharpeType){
            case "SQUARE": return new Square();
            case "CIRCLE": return new Circle();
            case "RECTANGLE":return new Rectangle();
        }
        return null;
    }
}
