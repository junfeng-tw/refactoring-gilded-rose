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
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePass(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateNormalItem(item);
                    break;
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sell_in -= 1;
            }

            if (item.sell_in < 0) {
                switch (item.name) {
                    case "Aged Brie":
                        updateAgredBrieAfterCheckSellIn(item);
                        break;
                    case "Backstage passes to a TAFKAL80ETC concert":
                        updateBackStagePassAfterCheckSellIn(item);
                        break;
                    case "Sulfuras, Hand of Ragnaros":
                        break;
                    default:
                        updateNormalItemAfterCheckSellIn(item);
                        break;
                }
            }
        }
    }

    private void updateNormalItemAfterCheckSellIn(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void updateBackStagePassAfterCheckSellIn(Item item) {
        item.quality = 0;
    }

    private void updateAgredBrieAfterCheckSellIn(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }

    private void updateNormalItem(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void updateBackstagePass(Item item) {
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
    }

    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }
}
