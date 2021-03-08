package org.fundacionjala.prog101.Gustavo.Practice04.Diamond;

public class ClassName implements Interface02,Interface03{

    @Override
    public void mesaggeRegards() {
        Interface03.super.mesaggeRegards();
        Interface02.super.mesaggeRegards();
    }
}
