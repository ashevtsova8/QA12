package lesson8.object;

public class Auto {
    private String model;
    private int year;
    private int dollarPrice;

    public Auto(String model, int year, int dollarPrice) {
        this.model = model;
        this.year = year;
        this.dollarPrice = dollarPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(int dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto thatAuto = (Auto) o;
        if (year != thatAuto.year) return false;
        if (dollarPrice != thatAuto.dollarPrice) return false;
        return model.equals(thatAuto.model);
    }

    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        result = 31 * result + dollarPrice;
        return result;
    }
}
