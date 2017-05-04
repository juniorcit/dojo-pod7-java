package com.ciandt.dojo.models;

/**
 * Created by wcarvalho on 03/05/17.
 */
public class Exam {
    private String name;
    private String code;
    private double price;

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                '}';
    }

    public Exam(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exam)) return false;

        Exam exam = (Exam) o;

        if (Double.compare(exam.getPrice(), getPrice()) != 0) return false;
        if (getName() != null ? !getName().equals(exam.getName()) : exam.getName() != null) return false;
        return getCode() != null ? getCode().equals(exam.getCode()) : exam.getCode() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
