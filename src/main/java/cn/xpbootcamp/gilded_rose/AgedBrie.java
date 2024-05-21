package cn.xpbootcamp.gilded_rose;

public class AgedBrie extends Item{
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality += 1;
        }
        sellIn -= 1;
        if (sellIn < 0 && quality < 50) {
            quality += 1;
        }
    }
}
