package com.example.hourscounter.model.enums;

import lombok.Getter;

@Getter
public enum JobType {
    DAMPFSPERRE(1.50),
    EINELAGE(2.70),
    ZWEILAGEN(3.45),
    DREILAGEN(4.65),
    VIERLAGEN(5.70),
    BKT(1.80),
    TRENNLAGE(0.30),
    EINELAGEOHNETACKERN(1.20),
    ZWEILAGENOHNETACKERN(2.40),
    TACKERN(2.10),
    NOPPENLAGE(2.85),
    AIRCONOMY(4.50);

    private final double priceProQM;

    JobType(double priceProQM){
        this.priceProQM = priceProQM;
    }
}
