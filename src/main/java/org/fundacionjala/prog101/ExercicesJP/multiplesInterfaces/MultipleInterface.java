package org.fundacionjala.prog101.ExercicesJP.multiplesInterfaces;

public class MultipleInterface implements Interface2,Interface3{

    @Override
    public void message() {
        Interface2.super.message();
        Interface3.super.message();
    }

    @Override
    public void operation(int a, int b) {
        Interface2.super.operation(a,b);
        Interface3.super.operation(a,b);
    }
}
