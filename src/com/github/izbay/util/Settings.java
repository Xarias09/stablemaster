package com.github.izbay.util;

public class Settings {

    public enum Setting {
        BASE_PRICE("values.base", 8),
        PRICE_PER_DAY("values.perday", 8),
        PIG_BASE_PRICE("values.pig", 50),
        NOBLE_COOLDOWN("values.cooldown", 4),
        
        COST_MESSAGE("text.cost", "�eIt's �a<BASE_PRICE>�e up front, and �a<PRICE_PER_DAY>�e per additional day to stable here. Sound good?"),
        FUNDS_MESSAGE("text.funds", "�cYou can't afford it!"),
        INVALID_MESSAGE("text.invalid", "�cYou look lost. You have nothing I can look after!"),
        ALREADY_MESSAGE("text.already", "�cI'm already watching one of yours!"),
        SALE_MESSAGE("text.sale", "�eIf you're looking to buy, I've got mounts for �a<MOUNT_PRICE>�e."),
        GIVE_MESSAGE("text.give", "�eGreat! Here she is!"),
        SHORT_MESSAGE("text.short", "�eYou've come up short. Take the pig, and I'll collect the rest next time."),
        DEBT_MESSAGE("text.debt", "�eI still need you to pay up from last time. It was �a<DEBT>�e."),
        PAID_MESSAGE("text.paid", "�eThanks! Now what can I do for you?"),
        STOW_MESSAGE("text.stow", "�eDon't you worry! I'll take fine care of her!"),
        TAKE_MESSAGE("text.take", "�eShe's been very well behaved."),
        TAKE2_MESSAGE("text.take2", "�eIt comes to �a<TOTAL_PRICE>�e, for <DAYS> days."),
        
        NOBLE_OFFER("noble.offer", "�eWould you like me to watch your Boar?"),
        NOBLE_STOW("noble.stow", "�eExcellent! I'll care for him as if he were my own."),
        NOBLE_FREE("noble.free", "�eYour grace! Please take my finest Boar. It is an honor!"),
        NOBLE_TAKE("noble.take", "�eHere he is, your grace. Bathed, brushed, and pampered!"),
        NOBLE_DENY("noble.deny", "�eAnother one? I can't afford that. It'd be �a<MOUNT_PRICE>�e.");

        private Object value;

        Setting(String path, Object value) {
            this.value = value;
        }

        public double asDouble() {
            if (value instanceof String)
                return Double.valueOf((String) value);
            if (value instanceof Integer)
                return (Integer) value;
            return (Double) value;
        }

        public int asInt() {
            return (Integer) value;
        }

        public String asString() {
            return value.toString();
        }
    }
}