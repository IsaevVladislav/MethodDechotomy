package com.company;
public class DichotomyData {
    public DichotomyData(double left, double right) {
        this.left = left;
        this.right = right;
    }

    private double left;
    private double right;

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }
}
