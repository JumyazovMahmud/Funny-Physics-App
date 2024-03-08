package com.example.funnyphysicsapp.module;

public class Formula {


    private String formula;

    private String info;




    public Formula() {
    }

    public Formula(Integer formulaId, String formula, String info, Integer scientistId) {
        this.formula = formula;
        this.info = info;
    }
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
