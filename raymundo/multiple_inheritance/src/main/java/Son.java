public class Son implements ParentOne, ParentTwo {
    public void message() {
        ParentOne.super.message();
        ParentTwo.super.message();
    }

    @Override
    public void hairStyle() {
        ParentTwo.super.hairStyle();
    }

    @Override
    public void eyeColor() {
        ParentOne.super.eyeColor();
    }
}
