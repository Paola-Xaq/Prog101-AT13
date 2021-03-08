public interface ParentTwo extends GrandParent {
    default void message() {
        System.out.println("Parent 2");
    }
    default void hairStyle() {
        System.out.println("Curly Hair");
    };
    default void eyeColor() {
        System.out.println("Brown eyes");
    }
}
