package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    if (item.quality < 50) {
                        item.quality += 1;
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (item.quality < 50) {
                        item.quality += 1;
                        if (item.sell_in < 11) {
                            if (item.quality < 50) {
                                item.quality += 1;
                            }
                        }

                        if (item.sell_in < 6) {
                            if (item.quality < 50) {
                                item.quality += 1;
                            }
                        }
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    if (item.quality > 0) {
                        item.quality -= 1;
                    }
                    break;
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sell_in -= 1;
            }

            if (item.sell_in < 0) {
                switch (item.name) {
                    case "Aged Brie":
                        if (item.quality < 50) {
                            item.quality += 1;
                        }
                        break;
                    case "Backstage passes to a TAFKAL80ETC concert":
                        item.quality = 0;
                        break;
                    case "Sulfuras, Hand of Ragnaros":
                        break;
                    default:
                        if (item.quality > 0) {
                            item.quality -= 1;
                        }
                        break;
                }
            }
        }
    }
}
