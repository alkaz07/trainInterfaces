public class DecoratorRoundBr implements IDecoratorStr{
    @Override
    public String decorate(String s) {
        return "("+s+")";
    }
}
