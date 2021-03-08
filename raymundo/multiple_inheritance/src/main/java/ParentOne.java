public interface ParentOne extends GrandParent{
    default void message() {
        System.out.println("Parent 1");
    }
    default void eyeColor() {
        System.out.println("Blue eyes");
    };
    default void hairStyle() {
        System.out.println("Straight hair");
    }
}
