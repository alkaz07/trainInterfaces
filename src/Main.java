import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String name2 = new DecoratorStar().decorate(name);
        System.out.println(name2);
        printDecStrNTimes(name, new DecoratorStar(), 4);
        printDecStrNTimes(name, new DecoratorRoundBr(), 3);
        printDecStrNTimes(name, new IDecoratorStr() {
            @Override
            public String decorate(String s) {
                return "ФИО: "+s;
            }


        }, 5);
        printDecStrNTimes(name, (s) -> "FIO: "+s+";" , 2);

        String s3 = "Что-нибудь";
        IDecoratorStr d = (s)->{
            return  s+"_"+s;
        };
        System.out.println(d.decorate(s3));
    }

    public static void printDecStrNTimes(String s, IDecoratorStr decorator, int n)
    {
        System.out.println("------------------------");
        if(decorator != null)
            for (int i = 0; i < n; i++) {
                String s2 = decorator.decorate(s);  //обращаемся к методу, заголовк которого
                    //известен, а вот реализация определится  по ходу работы
                System.out.println(s2);
            }
        System.out.println("------------------------");
    }
}