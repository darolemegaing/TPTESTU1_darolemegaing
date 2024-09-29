package com.stjean.operation;
public boolean estPositif(int nombre) {
    return nombre > 0;
}


public int factoriel(int nombre) {
    if (nombre == 0) return 1;
    int result = 1;
    for (int i = 1; i <= nombre; i++) {
        result *= i;
    }
    return result;
}
