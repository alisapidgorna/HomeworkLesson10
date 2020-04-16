public class Main {
    public static void main(String[] args) {
        System.out.println("Если мы видим одинаковые значения, значит синглтон использовался повторно (Круть!)" + "\n" +
                "Если мы видим разные значения, тогда было создано два синглтона (Плохо!)" + "\n" + "Результат:");
        Singleton singleton = Singleton.getInstance("I like Java!");
        Singleton secondSingleton = Singleton.getInstance("I dont like Java!");
        System.out.println(singleton.value);
        System.out.println(secondSingleton.value);

        ShopComfy microwave1 = new ShopComfy("LG NeoChef",6300);
        ShopComfy microwave2 = new ShopComfy("Toshiba MW2",3000);
        ShopComfy microwave3 = new ShopComfy("LG NeoChef",6300);

        System.out.println("\n" + "Для проверки эквивалентности в классе Object есть метод equals, который сравнивает содержимое объектов и"
                + "\n" + "выводит значение true, если содержимое эквивалентно, и false - если нет:");
        System.out.println(microwave1.equals(microwave3));
        System.out.println(microwave2.equals(microwave3));

        System.out.println("Если у двух объектов одного и того же класса одинаковое содержимое, то и хеш-коды должны быть одинаковые:");
        System.out.println(microwave1.hashCode());
        System.out.println(microwave3.hashCode());
        System.out.println(microwave2.hashCode());
        System.out.println(microwave1.hashCode() == microwave3.hashCode());
        System.out.println(microwave2.hashCode() == microwave3.hashCode());
    }
}
