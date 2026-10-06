package model;

import Enum.masa;
import Enum.salsa;
import Enum.topping;

public class pizza {
    topping topping;
    masa masa;
    salsa salsa;
    int cantidad;

    public pizza(int cantidad, masa masa, salsa salsa, topping topping){
        this.cantidad = cantidad;
        this.masa = masa;
        this.salsa = salsa;
        this.topping = topping;
    }

    public pizza(int cantidad, salsa salsa, masa masa){
        this.cantidad = cantidad;
        this.salsa = salsa;
        this.masa = masa;
    }

    public pizza(int cantidad, masa masa, salsa salsa, topping topping, topping topping2){
        this.cantidad = cantidad;
        this.masa = masa;
        this.salsa = salsa;
        this.topping = topping;
        this.topping = topping2;
    }

        public pizza(int cantidad, salsa salsa, topping topping, topping topping2){
        this.cantidad = cantidad;
        this.salsa = salsa;
        this.topping = topping;
        this.topping = topping2;
    }
}

