package cn.xpbootcamp.gilded_rose;

public class ItemFactory {
    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(name, sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(name, sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(name, sellIn, quality);
            default:
                return new NormalItem(name, sellIn, quality);
        }
    }
}
