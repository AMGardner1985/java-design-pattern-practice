package com.gardner.adam.designpatterndemo.builder;

public class LunchOrder {

    public static class Builder{
        //own container until ready to build and give back its item
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){
            //could put in mandatory items if required
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }
        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread(){
        return this.bread;
    };

    public String getCondiments(){
        return this.condiments;
    };

    public String getDressing(){
        return this.dressing;
    };

    public String getMeat(){
        return this.meat;
    };

}
