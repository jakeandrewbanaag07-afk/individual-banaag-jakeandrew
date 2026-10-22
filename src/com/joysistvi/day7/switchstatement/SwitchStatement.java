package com.joysistvi.day7.switchstatement;

public class SwitchStatement {

    public static void main(String[] args) {
        String sizeCode = "XL";
        String sizeDescription = "";

        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":
                sizeDescription = "Extra Large";
                break;
            default:
                sizeDescription = "Invalid Input";

        }
        System.out.println("Size: " + sizeDescription);

    }
}
