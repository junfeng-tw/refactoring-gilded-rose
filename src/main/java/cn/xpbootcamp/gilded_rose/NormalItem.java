package cn.xpbootcamp.gilded_rose;

public class NormalItem extends Item{

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            quality -= 1;
        }
        sellIn -= 1;
        if (sellIn < 0 && quality > 0) {
            quality -= 1;
        }
    }
}
