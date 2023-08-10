public class DecoratorStar implements IDecoratorStr{
    @Override
    public String decorate(String s) {
        return "**"+s+"**";
    }

}
